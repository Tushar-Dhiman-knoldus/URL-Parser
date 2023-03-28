package com.knoldus.urlparser
import scala.util.Try

object UrlParser {

  def apply(url: String) = s"$url"

  def unapply(url: String): Option[(String, String, String)] = {

    Try {
      val protocol: String = url.substring(0, url.indexOf("://"))
      val domain: String = url.substring(url.indexOf("://") + 3, url.indexOf("/", url.indexOf("://") + 3))
      val path: String = url.substring(url.indexOf("/", url.indexOf("://") + 3) + 1)
      (protocol, domain, path)
    }.toOption
  }
}

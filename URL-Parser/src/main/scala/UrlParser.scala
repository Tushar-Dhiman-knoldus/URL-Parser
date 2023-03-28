package com.knoldus.urlparser

import scala.util.Try

object UrlParser {
  //This method takes a string URL and returns it as is
  def apply(url: String) = s"$url"

  // This method extracts the protocol, domain, and path from a string URL
  def unapply(url: String): Option[(String, String, String)] = {

    Try {
      val protocol: String = url.substring(0, url.indexOf("://"))
      val domain: String = url.substring(url.indexOf("://") + 3, url.indexOf("/", url.indexOf("://") + 3))
      val path: String = url.substring(url.indexOf("/", url.indexOf("://") + 3) + 1)
      (protocol, domain, path)
    }.toOption
  }
}

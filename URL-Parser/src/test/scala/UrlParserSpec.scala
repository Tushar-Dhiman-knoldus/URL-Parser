package com.knoldus.urlparser

import org.scalatest.flatspec.AnyFlatSpec

class UrlParserSpec extends AnyFlatSpec {

  "UrlParser" should "break down the url into Protocol, Domain, Path" in {
    val urlParserObject = UrlParser("https://www.mywebsite.com/home")
    val expectedResult: String = urlParserObject match {
      case UrlParser(protocol, domain, path) => s"Protocol:$protocol\nDomain:$domain\nPath:$path"
      case _ => "Not a valid URL"
    }
    assert(expectedResult == ("Protocol:https\nDomain:www.mywebsite.com\nPath:home"))
  }

  "UrlParser" should "return the Not a valid URL if link is not provided" in {
    val urlParserObject = UrlParser("")
    val expectedResult: String = urlParserObject match {
      case UrlParser(protocol, domain, path) => s"Protocol:$protocol\nDomain:$domain\nPath:$path"
      case _ => "Not a valid URL"
    }
    assert(expectedResult == ("Not a valid URL"))
  }
}



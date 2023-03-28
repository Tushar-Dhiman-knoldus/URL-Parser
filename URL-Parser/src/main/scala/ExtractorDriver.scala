package com.knoldus.urlparser

object ExtractorDriver extends App {

  private val urlParserObject = UrlParser("https://www.mywebsite.com/home")
  urlParserObject match {
    case UrlParser(protocol, domain, path) => println(s"Protocol:$protocol\nDomain:$domain\nPath:$path")
    case _ => println("Not a valid URL")
  }

}

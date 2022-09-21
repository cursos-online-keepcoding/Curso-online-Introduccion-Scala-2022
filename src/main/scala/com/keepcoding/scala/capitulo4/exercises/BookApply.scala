package com.keepcoding.scala.capitulo4.exercises


class Book(val title: String, val author: String)

object Book {
  def apply(line: String): Book = {
    val split = line.split(";")
    new Book(split(0), split(1))
  }
}

object BookApply extends App {

  val book = Book("Programming Scala;Martin")
  println(s"Title: ${book.title} - Author: ${book.author}")

}

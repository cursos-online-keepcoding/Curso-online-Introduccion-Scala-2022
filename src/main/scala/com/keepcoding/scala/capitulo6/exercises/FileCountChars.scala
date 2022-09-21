package com.keepcoding.scala.capitulo6.exercises

import scala.util.Try

object FileCountChars {

  val vowels = "aeiou"
  val initialMap: Map[Char, Int] = Map('a' -> 0, 'e' -> 0, 'i' -> 0, 'o' -> 0, 'u' -> 0)

  def main(args: Array[String]): Unit = {

    val result = Try {
      import scala.io.Source
      val file = Source.fromFile("/home/agutierrez/coverage-error.lo")

      // partition
      val (vowelsList, otherList) = file.toList.partition(c => vowels.contains(c))

      // foldLeft
      val vCount = vowelsList.foldLeft(initialMap)((acc, curr) => acc + (curr -> (acc(curr) + 1)))

      println(s"Total de letras -> ${vowelsList.length + otherList.length}")
      println(s"Total de vocales -> a: ${vCount('a')} - e: ${vCount('e')} - i: ${vCount('i')} - o: ${vCount('o')} - u: ${vCount('u')}")
      println(s"Total de no vocales -> ${otherList.length}")
    }

    if(result.isFailure)
      println(s"Error counting chars: ${result.failed.get.getMessage}")

  }

}

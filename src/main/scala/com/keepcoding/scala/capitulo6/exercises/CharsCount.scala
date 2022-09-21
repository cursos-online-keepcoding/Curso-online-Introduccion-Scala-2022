package com.keepcoding.scala.capitulo6.exercises

import scala.annotation.tailrec

object CharsCount {

  def charsCount(str: String): Map[Char, Int] = {
    @tailrec
    def charCountRec(chars: List[Char], current: Map[Char, Int]): Map[Char, Int] =
      chars match {
        case Nil => current
        case chr :: tail =>
          val updatedChar = chr -> (current.getOrElse(chr, 0) + 1)
          charCountRec(tail, current + updatedChar)
      }
    charCountRec(str.toLowerCase.replace(" ", "").toList, Map.empty[Char, Int])
  }


  def main(args: Array[String]): Unit = {
    val count = charsCount("KeepCoding - Introduccion a Scala")
    println(count)
  }

}

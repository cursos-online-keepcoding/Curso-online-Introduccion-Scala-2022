package com.keepcoding.scala.capitulo5.exercises

object OptionContainString {

  def containString(original: String, sub: String): Option[String] =
    if (original.contains(sub)) Some(original) else None

  def main(args: Array[String]): Unit = {
    val result = containString("keepCoding", "keep")
    result match {
      case Some(str) => println(s"estaba contenido en $str")
      case _ => println("No estaba contenido")
    }
  }

}

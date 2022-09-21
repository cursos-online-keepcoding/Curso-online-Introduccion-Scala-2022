package com.keepcoding.scala.capitulo5.exercises

object OptionSaludos {

  def saludos(msg: Option[String]): String =
    msg match {
      case Some(m) => m
      case None => "Saludos, Humano!"
    }

  def main(args: Array[String]): Unit = {
    println(saludos(None))
    println(saludos(Some("Saludos!!")))
  }

}

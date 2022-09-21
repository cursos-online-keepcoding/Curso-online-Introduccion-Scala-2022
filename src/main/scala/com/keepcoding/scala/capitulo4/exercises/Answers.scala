package com.keepcoding.scala.capitulo4.exercises

sealed trait Answer {
  val message: String
}
case class Yes(message: String) extends Answer
case class No(message: String) extends Answer
case object Unknown extends Answer {
  override val message = "NS/NC"
}

object Answers {

  def processAnswer(answer: Answer): Unit = answer match {
    case Yes(msg) => println(s"Respuesta Si, con mensaje: $msg")
    case No(msg) => println(s"Respuesta No, con mensaje: $msg")
    case Unknown => println(s"Respuesta: ${Unknown.message}")
  }

  def main(args: Array[String]): Unit = {
    val yes = Yes("Estoy totalmente de acuerdo")
    val no = No("No estoy de acuerdo")
    val unknown = Unknown

    processAnswer(yes)
    processAnswer(no)
    processAnswer(unknown)
  }

}
package com.keepcoding.scala.capitulo4

object ExecutableObject {

    def main(args: Array[String]): Unit = {
        println("Hello Scala!")
        println(s"Argument languages are: ${args.mkString(", ")}!")
    }

}


// extending App, no main def is needed
object ExecutableObjectApp extends App {
    println("Hello Scala!")
    println(s"Argument languages are: ${args.mkString(", ")}!")
}

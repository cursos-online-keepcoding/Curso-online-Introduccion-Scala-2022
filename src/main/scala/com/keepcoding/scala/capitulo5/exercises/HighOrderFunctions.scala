package com.keepcoding.scala.capitulo5.exercises



object HighOrderFunctions {

  def printConsole(s: String): Unit = println(s)

  import java.io.PrintWriter
  def printFile(s: String): Unit = {
    new PrintWriter("/tmp/solution.txt") {
      write(s); close
    }
  }

  // función de orden superior
  def printSomething(s: String, printer: String => Unit) = printer(s)

  def main(args: Array[String]): Unit = {
    printSomething("el texto a imprimir", printConsole)
    printSomething("el texto a imprimir", printFile)
  }

}

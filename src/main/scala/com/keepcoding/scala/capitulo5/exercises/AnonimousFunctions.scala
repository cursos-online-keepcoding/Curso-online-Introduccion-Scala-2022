package com.keepcoding.scala.capitulo5.exercises


object Calculadora {
  private def calc(f: (Int, Int) => Int) = f

  val suma = calc(_ + _)
  val resta = calc(_ - _)
  val multiplicacion = calc(_ * _)
  val division = calc(_ / _)
}


object AnonimousFunctions extends App {
  println(Calculadora.suma(1,2))
  println(Calculadora.resta(2, 3))
}

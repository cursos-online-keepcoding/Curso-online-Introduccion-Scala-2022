package com.keepcoding.scala.capitulo5.exercises

class Wrapper[A](value: A) {
  def get: A = value
  def map[B](f: A => B): Wrapper[B] = new Wrapper(f(value))
  override def toString: String = s"Inner value: ${value.toString} of class ${value.getClass}"
}

object GenericWrapper extends App {
  val wrapInt = new Wrapper(12)
  val int = wrapInt.get
  val wrapString = wrapInt.map(_.toString)

  println(wrapInt)
  println(int)
  println(wrapString)
}

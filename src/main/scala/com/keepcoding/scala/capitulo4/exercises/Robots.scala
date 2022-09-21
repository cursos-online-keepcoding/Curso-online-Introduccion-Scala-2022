package com.keepcoding.scala.capitulo4.exercises

/**
 *
 */


abstract class Robot(name: String, serialNumber: Int) {
  def presentation: String = s"Hello! My name is $name and my serial number is $serialNumber"
  def welcome(dude: String): String
}

class CleanerRobot(name: String, serialNumber: Int) extends Robot(name, serialNumber) {
  override def welcome(dude: String): String = s"Hello $dude, my name is $name, how can I help you?"
}

class KillerRobot(name: String, serialNumber: Int, weapon: String) extends Robot(name, serialNumber) {
  override def welcome(dude: String): String = s"Hello $dude, my name is $name, Im gonna kill you!"
}


object Robots extends App {
  val bob = new CleanerRobot("Bob", 12345)
  val arthur = new KillerRobot("Arthur", 101, "knife")

  println(bob.presentation)
  println(bob.welcome("Luke"))
  println(arthur.presentation)
  println(arthur.welcome("Luke"))
}
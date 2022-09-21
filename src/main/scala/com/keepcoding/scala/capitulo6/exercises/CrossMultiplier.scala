package com.keepcoding.scala.capitulo6.exercises

object CrossMultiplier {

  def crossMultiplierFlatMap(setA: Set[Int], setB: Set[Int]): Set[Int] = {
    setA.flatMap(a => setB.map(b => b * a))
  }

  def crossMultiplierFor(setA: Set[Int], setB: Set[Int]): Set[Int] = {
    for {
      a <- setA
      b <- setB
    } yield a * b
  }

  def main(args: Array[String]): Unit = {
    val multiFlatMap = crossMultiplierFlatMap(Set(1, 2, 3), Set(2, 4))
    println(multiFlatMap)

    val multiFor = crossMultiplierFor(Set(1, 2, 3), Set(2, 4))
    println(multiFor)
  }

}

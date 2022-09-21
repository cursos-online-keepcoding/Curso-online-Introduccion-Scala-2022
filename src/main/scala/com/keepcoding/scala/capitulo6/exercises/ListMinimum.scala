package com.keepcoding.scala.capitulo6.exercises

import scala.annotation.tailrec

object ListMinimum {

  def findMin(lst: List[Int]): Option[Int] = {
    @tailrec
    def findMinRec(l: List[Int], currentMin: Int): Int = l match {
      case Nil => currentMin
      case head :: tail => findMinRec(tail, Math.min(currentMin, head))
    }
    if(lst.isEmpty) None
    else Some(findMinRec(lst.tail, lst.head))
  }

  def main(args: Array[String]): Unit = {
    val min = findMin(List(12, 13, 31, 4, 78, 342, 31, 6, 234, 23 , 5, 7))
    println(min)
  }

}

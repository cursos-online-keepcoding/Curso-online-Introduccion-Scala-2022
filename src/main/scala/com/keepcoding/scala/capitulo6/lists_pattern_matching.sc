val brands1 = List("bmw", "seat", "mercedes", "kia")
val brands2 = "bmw" :: "seat" :: "mercedes" :: "kia" :: Nil

brands1.dropRight(1)

// implementacion para eliminar el ultimo elemento de una lista
def removeLastItem[A](list: List[A]): List[A] = list match {
  case Nil => Nil
  case _ :: Nil => Nil
  case lst :+ _ => lst
}

removeLastItem(brands1)
removeLastItem(List("a"))
removeLastItem(List("a", "b"))
removeLastItem(List(1, 2, 3, 4, 5))

// implementacion para eliminar los n ultimos elementos
// recursivamente
def removeLastItems[A](list: List[A], n: Int): List[A] = list match {
  case Nil => Nil
  case lst if lst.length <= n => Nil
  case head +: tail => head +: removeLastItems(tail, n)
}

removeLastItems(brands1, 2)
removeLastItems(List("a"), 3)
removeLastItems(List("a", "b"), 1)
removeLastItems(List(1, 2, 3, 4, 5),3 )
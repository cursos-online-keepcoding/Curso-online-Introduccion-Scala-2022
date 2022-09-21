val lst1 = List(1, 2, 3, 4, 5)
val lst2 = List(10, 11, 12, 13, 14)

// obtener elementos por posicion
lst1.apply(2)
lst1(4)
// lst1(12) // java.lang.IndexOutOfBoundsException

// obtener el primer elemento y el tail
lst1.head
List().headOption

lst1.tail
lst1.tails.foreach(println)

// añadir elementos, al principio y al final
lst1 :+ 8
8 +: lst1

// concatenar listas
lst1 ++ lst2
lst1 :+ lst2 // ojo, no concatena

// chequear posiciones o elementos
lst1.isDefinedAt(12)
lst1.isDefinedAt(3)
lst1.contains(10)
lst2.contains(10)

// chequear el estado de la lista
lst1.length
lst1.isEmpty
lst1.nonEmpty

// transformacion de listas
lst1.reverse
lst1.sorted
(lst2 ++ lst1)
(lst2 ++ lst1).sorted
lst2.sortWith(_ > _)

// componer un string con el contenido de la lista
lst2.mkString(" - ")
lst2.mkString(", ")
lst2.mkString("[", " - ", "]")

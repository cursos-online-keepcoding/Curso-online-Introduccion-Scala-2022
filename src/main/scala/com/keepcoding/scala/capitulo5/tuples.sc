// declaracion de tuplas
(2.0)
(1, 2, 3)
("hola", 2)
((1, 2), "adios")

// operador arrow
("item" -> 2)
("item" -> 2 -> 3)

// obtener elementos
val tupla = ("hola", 2)
tupla._1
tupla._2

// obtener elementos mas elegante
val (a, b) = tupla
println(s"$a - $b")

// pattern matching
tupla match {
  case (_, b) if (b > 10) => println("mayor que 10")
  case (a, _) if !a.equals("hola") => println(a)
  case (a , b) => println(s"$a - $b")
}
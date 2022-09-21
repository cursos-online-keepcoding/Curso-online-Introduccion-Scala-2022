// declarar Maps
val m: Map[String, Int] = Map(("1", 1), ("2", 2))
val m: Map[String, Int] = Map("1" -> 1, "2" -> 2)

Map()
Map.empty[Int, Int]

// añadir o eliminar elementos
val m3 = m + ("3" -> 3)
val m2 = m3 - "3"

val m5 = m3 ++ Map("3" -> 67, "4" -> 4, "5" -> 5)
val m4 = m5 -- List("5")

// elementos de la coleccion
m5.values.toList
m5.keys

m5.head
m5.tail

val (k, v) = m5.head

// valor por clave
m5.apply("4")
m5("4")
m5.apply("6") // java.util.NoSuchElementException

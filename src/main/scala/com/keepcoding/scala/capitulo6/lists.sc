// crear listas
val brands = List("bmw", "seat", "mercedes", "kia")
val nums = List(1, 2, 3, 4, 5)
val empty = List()

// 2 bloques basicos
// Nil => Lista vacia
// operador :: 'cons' => añadir elemento al head de la lista
val brands = "bmw" :: "seat" :: "mercedes" :: "kia" :: Nil
val nums = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
val empty = Nil

// añadir elementos, en una lista nueva
brands :+ "renault"
"renault" +: brands
"renault" :: brands

// concatenar listas
List(1, 2, 3) ++ List(4, 5, 6)

// head tail
brands.head
brands.tail

// List().head // NoSuchElementException
// List().tail // UnsupportedOperationException
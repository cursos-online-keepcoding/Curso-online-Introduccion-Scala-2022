List.empty
List()

List(1, 2, 3, 4)
1 :: 2 :: 3 :: 4 :: Nil

List.concat(List(1, 2), List(3, 4))

// rellenar todos los elementos de la lista con una expresion
List.fill(4)("hola")
List.fill(4, 4)("hola").mkString("\n")

// Aplicar una funcion a cada posicion de la lista
List.tabulate(4)(a => a)
List.tabulate(4)(_ * 2)
List.tabulate(4,4)((a, b) => s"$a-$b").mkString("\n")

// Crea un rango de elementos
List.range(0, 10)
List.range(0, 10, 3)


List.iterate(1, 10)(_*2)


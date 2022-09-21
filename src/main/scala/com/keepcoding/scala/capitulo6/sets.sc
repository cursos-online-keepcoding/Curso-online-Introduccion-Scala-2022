val setN = Set(1, 2, 3, 4, 5, 5, 6, 7, 7)
val setS = Set("hello", "keep", "Coding", "keep", "hello")

// no tenemos posiciones ni orden
// pero podemos recorrer el Set
setN.foreach(println)

// añadir y eliminar elementos
setN + 8
setN + 4
setN - 5
setN - 12

// union, interseccion y la diferencia
val set1 = Set(1, 2, 3 ,4, 5)
val set2 = Set(3, 4, 5, 6, 7, 8)

set1.union(set2).toList.sorted // toList nos convierte el Set en List
set1.intersect(set2)
set1.diff(set2)
set2.diff(set1)

// como operadores 'aritmeticos'
set1 ++ set2
set1 & set2
set1 -- set2

// El metodo apply en los sets comprueba si el elemento existe
set2(3)
setS("hello!")
setS.contains("keep")
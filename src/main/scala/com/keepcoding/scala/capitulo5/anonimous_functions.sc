// funcion normal
def suma(a: Int, b: Int): Int = {
  a + b
}
suma(1, 2)

// 1. Eliminamos el nombre y le quitamos el tipo devuelto. Añadimos =>
val suma = (a: Int, b: Int) => a + b
suma(1, 2)

// 2. Movemos el tipo de los parametros a la declaracion de la variable (contexto)
val suma: (Int, Int) => Int = (a, b) => a + b
suma(1, 2)

// 3. Como sabemos que son dos parametros y su tipo, podemos usar _ + _
val suma: (Int, Int) => Int = _ + _
suma(1, 2)

// ejemplo de uso en una funcion de orden superior
val lst = List(1, 2, 3)
lst.foldLeft(0)(_ + _)

// implementacion de calculadora con funciones anonimas
object Calculadora {
  // calc es una funcion de orden superior
  private def calc(f: (Int, Int) => Int) = f
  val suma = calc(_ + _)
  val resta = calc(_ - _)
  val multiplicacion = calc(_ * _)
  val division = calc(_ / _)
}

Calculadora.suma(1, 2) // 3
Calculadora.resta(2, 3) // -1
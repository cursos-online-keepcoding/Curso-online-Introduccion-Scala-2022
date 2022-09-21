// partimos de una funcion que devuelve Option
def sqrt(n: Int): Option[Double] = {
  if (n >= 0) Some(Math.sqrt(n)) else None
}

/**
sealed abstract class Either[A, B] //Option[A]
case class Left[A, B](value: A) extends Either[A, B]
case class Right[A, B](value: B) extends Either[A, B]
*/

  // Asi sería adaptada
def sqrt(n: Int): Either[String, Double] = {
  if (n >= 0) Right(Math.sqrt(n))
  else Left("El numero es negativo, no se puede calcular sqrt")
}

val x = 12
val y = -23

sqrt(x)
sqrt(y)

// Para recuperar el contenido de Left o de Right hacemos
// pattern matching
def printSqrt(sqrtResult: Either[String, Double]): Unit =
  sqrtResult match {
    case Left(error) => println(s"Error al calcular: $error")
    case Right(result) => println(s"El resultado es: $result")
  }

printSqrt(sqrt(x))
printSqrt(sqrt(y))
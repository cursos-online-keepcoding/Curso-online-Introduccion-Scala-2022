// Declaracion de Either[Double, String]
val left: Either[Double, String] = Left(3.4)
val right: Either[Double, String] = Right("KeepCoding")

// map de left
left.left.map(d => d * 100)
right.left.map(d => d * 100)

// map de right
left.right.map(d => "Hola, " + d)
right.right.map(d => "Hola, " + d)

// map. Por defecto coge el happy path de Right
left.map(d => "Hola, " + d)
right.map(d => "Hola, " + d)

// flatMap. puede aplicar a left o a right
// por defecto va a Right
def suma(result1: Either[String, Double],
         result2: Either[String, Double]): Either[String, Double] =
  result1.flatMap{ r1 =>
    result2.map{ r2 =>
      r1 + r2
    }
  }

suma(Right(2.5), Right(1.0))
suma(Left("R1 no es valido"), Right(1.0))
suma(Right(1.0), Left("R2 no es valido"))
suma(Left("R1 no es valido"), Left("R2 no es valido"))

// for-comprehension
def suma(result1: Either[String, Double],
         result2: Either[String, Double]): Either[String, Double] =
  for {
    r1 <- result1
    r2 <- result2
  } yield r1 + r2

suma(Right(2.5), Right(1.0))
suma(Left("R1 no es valido"), Right(1.0))
suma(Right(1.0), Left("R2 no es valido"))
suma(Left("R1 no es valido"), Left("R2 no es valido"))

// metodos comunes Either
val r = Right("KeepCoding")
val l: Either[Double, String] = Left(3.2)

// getOrElse
r.getOrElse("default")
left.getOrElse(0.0)

// isRight isLeft
r.isLeft
r.isRight

// exists
r.exists(_.contains("K"))
l.exists(_.contains("K"))
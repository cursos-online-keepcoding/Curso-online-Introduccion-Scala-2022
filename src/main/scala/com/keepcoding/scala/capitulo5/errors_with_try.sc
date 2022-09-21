// definicion Try
/**
sealed abstract class Try[T]
case class Success[T](t: T) extends Try[T]
case class Failure[T](throwable: Throwable) extends Try[T]
*/


// Primera aproximacion
import scala.io.Source
import scala.util.{Failure, Success, Try}

val tryFile = Try(Source.fromFile("coverage-error.log"))

tryFile match {
  case Success(f) => {
    val fileList = f.toList
    val count = fileList.length
    println(s"Total de letras -> ${count}")
  }
  case Failure(ex: java.io.FileNotFoundException) => println(s"File not found")
  case Failure(ex: java.io.IOException) => println("Something went wrong reading")
}

// Segunda aproximacion con map
val tryFile = Try(Source.fromFile("coverage-error.log"))
val count = tryFile.map(_.toList).map(_.length)

count match {
  case Success(count) => println(s"Total de letras -> ${count}")
  case Failure(ex: java.io.FileNotFoundException) => println(s"File not found")
  case Failure(ex: java.io.IOException) => println("Something went wrong reading")
}

// flatten y flatMap
val tryFile = Try(Source.fromFile("coverage-error.log"))
val count = tryFile.map(_.toList).map(_.length)
val reference = 3000
val proportions = count.flatMap(c => Try(reference/c))
println(proportions.toString)
count match {
  case Success(count) => println(s"Total de letras -> ${count}")
  case Failure(ex: java.io.FileNotFoundException) => println(s"File not found")
  case Failure(ex: java.io.IOException) => println("Something went wrong reading")
}

// forComprehension
val tryFile = Try(Source.fromFile("coverage-error.lg"))
val counts = tryFile.map(_.toList).map(_.length)
val reference = 3000

val proportion = for {
  c <- counts
  n <- Try(reference/c)
} yield n

// getOrElse
println(proportion.getOrElse(0))
println(counts.getOrElse(0))

// isFailure isSuccess
proportion.isFailure
proportion.isSuccess

// toOption toEither
counts.toOption // success -> Some  failure -> None
counts.toEither // success -> Right  failure -> Left(Throwable)


//counts match {
//  case Success(count) => println(s"Total de letras -> ${count}")
//  case Failure(ex: java.io.FileNotFoundException) => println(s"File not found")
//  case Failure(ex: java.io.IOException) => println("Something went wrong reading")
//}



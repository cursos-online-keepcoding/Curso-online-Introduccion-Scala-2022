import scala.concurrent.Future
import scala.util.{Failure, Success}

def getProduct(id: Int): Int = {
  Thread.sleep(2000)
  40
}

// val x = getProduct(1) // llamada sincrona

import scala.concurrent.ExecutionContext.Implicits.global
val future = Future {
  getProduct(1) // llamada asincrona
}

future.onComplete {
  case Success(p) => println(s"Product obtenido: $p")
  case Failure(e) => println(s"Error getting product: $e")
}

println("Continuando ejecucion")
Thread.sleep(3000)
println("Finalizando ejecucion")
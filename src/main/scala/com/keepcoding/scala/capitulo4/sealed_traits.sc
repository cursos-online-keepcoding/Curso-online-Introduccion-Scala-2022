// sealed trait y clases en un mismo fichero
// es equivalente con abstract class
sealed trait Respuesta
class Si extends Respuesta
class No extends Respuesta
class Desconocido extends Respuesta

val respuesta: Respuesta = new No

// El compilador nos avisará si no contemplamos todos los casos
respuesta match {
  case x: Si => println("respuesta afirmativa")
  case x: No => println("respuesta negativa")
  case x: Desconocido => println("No sabe no contesta")
}


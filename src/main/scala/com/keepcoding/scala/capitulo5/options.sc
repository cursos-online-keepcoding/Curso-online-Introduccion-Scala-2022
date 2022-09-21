/** Implementacion del Option
package scala

sealed abstract class Option[A] {....}// Option[Int] - Option[String] - Option[(Int) => Boolean]
case class Some[A](a: A) extends Option[A]
case object None extends Option[Nothing]
*/
// uso de options
def sqrt(n: Int): Option[Double] =
  if (n >= 0) Some(Math.sqrt(n)) else None

val x = sqrt(12)
val y = sqrt(-1)

// comprobacion usando pattern Matching
x match {
  case Some(n) => println(s"La raiz cuadrada es ${n}")
  case None => println("no se ha podido calcular la raiz cuadrada")
}
y match {
  case Some(n) => println(s"La raiz cuadrada es ${n}")
  case None => println("no se ha podido calcular la raiz cuadrada")
}

println(x.get)
println(y.get) // cuidado! NoSuchElementException

/** EJERCICIO
 Escribir una funcion que acepte 2 parametros de tipo String
 Si el segundo String esta contenido en el primero,
 devolvemos la cadena original (Siendo un Option)
 Si el segundo String no esta contenido en el primero, devolvemos
 no value
**/
def containString(original: String, sub: String): Option[String] =
  if(original.contains(sub)) Some(original) else None

val result = containString("keepCoding", "keep")

result match {
  case Some(str) => println(s"estaba contenido en $str")
  case _ => println("No estaba contenido")
}

def greetings(msg: Option[String]): String = msg match {
  case Some(m) => m
  case None => "Greetings, Human!"
}


// no hacer esto, uso de nulos
/*
def sqrt(n: Int): Double = {
  if (n >= 0) Math.sqrt(n) else null
}

// programacion defensiva
val x: Int = ???
val result = sqrt(x)
if (result == null) {
  // accion si nulos
} else {
  // tenemos result
}
 */
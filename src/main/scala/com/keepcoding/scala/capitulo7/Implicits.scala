package com.keepcoding.scala.capitulo7

object Implicits extends App {

  /**
   * Implicit Parameter. Añadimos un nuevo parametro implicito a un método
   */

  implicit val myStr = "Juan dice"  // se debe declarar un value implicito para que lo obtenga el metodo

  // prefix será el parámetro implicito
  def printMessage(text: String)(implicit prefix: String) =
    println(s"$prefix: $text")

  printMessage("Hola Scala!")
  printMessage("como estas?")

  // Ejemplo de implicit parameter en colecciones:
  // En una List el método sorted recibe un parametro implicito de tipo Ordering
  // podemos sobreescribir el que nos viene desde scala.Predef
  implicit val reverseOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)
  println(
    List(2, 3, 5, 3, 1, 0).sorted // import scala.Predef
  )


  /**
   * Implicit Conversions
   */
  import scala.language.implicitConversions

  case class Person(name: String, age: Int)

  // Posibilita que cuando se requiera un objeto Person se
  // pueda poner una tupla (String, Int)
  implicit def tupleToPerson(t: (String, Int)): Person = Person(t._1, t._2)

  def printPerson(p: Person) = println(s"${p.name} has ${p.age} years")

  val john = "John" -> 22
  val peter = Person("Peter", 45)

  printPerson(peter)
  printPerson(john)


  /**
   * Implicit Class. Añadimos funcionalidad extra a objetos externos
   */
  implicit class PersonExtended(p: Person) {
    def printPerson = println(s"From implicit class: ${p.name} has ${p.age} years")
  }

  peter.printPerson

}

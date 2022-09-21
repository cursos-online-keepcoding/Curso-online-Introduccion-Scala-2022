// Clase abstracta con metodo sin implementar
abstract class Publication(
                   val title: String,
                   val price: Double
                 ) {
  def print: Unit
}

// Implementa print
class Book(title: String,
           val author: String,
           price: Double) extends Publication(title, price) {
  def print: Unit = println(s"Book '$title' with price $price")
}

// Implementa print
class Magazine(title: String,
               val editor: String,
               price: Double) extends Publication(title, price) {
  def print: Unit = println(s"Magazine '$title' with price $price")
}

val b = new Book("Programming Scala", "Martin Odersky", 30)
val m = new Magazine("Time", "Time inc.", 3)

b.print
m.print
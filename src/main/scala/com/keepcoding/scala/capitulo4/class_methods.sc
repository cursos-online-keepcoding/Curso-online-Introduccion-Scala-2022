// declaramos metodos en las clases como funciones normales
class Book(var title: String,
           var author: String = "",
           var price: Double = 12.0) {

  def addTaxes(percent: Double): Double = {
    price + price * percent
  }
}

val b = new Book("Programming Scala", "Martin Odersky", 30.0)

println(b.addTaxes(0.10))

// Declaracion básica de una clase en scala
class Book(var title: String) {
  // codigo de usuario
  println("Comienza el constructor")

  // crear nuevos campos
  var author: String = ""

  // campos privados
  private val price = 2.0

  // metodos propios
  def printPrice = println(s"Price is $price")

  // llamar a funciones creadas
  printPrice

  // override metodos
  override def toString: String = s"Book $title from $author with $price"
}

val b = new Book("Programming Scala")

println(b.title)
println(b.author)

b.title = "Programming Scala 2nd Edition"
b.author = "Martin Odersky"

println(b.title)
println(b.author)

println(b)
// clase companion
class Book(var title: String,
           var author: String,
           var price: Double) {
  override def toString: String = s"$title - $author - $price"
}

// objeto companion implementando un apply a partir de un string
object Book {
  // title;autor;precio
  def apply(line: String): Book = {
    val parts = line.split(";") // title, autor, precio
    new Book(parts(0), parts(1), parts(2).toDouble)
  }
}

// ejemplo de uso
val line = "Programming Scala;Martin Odersky;20.5"

val b2 = Book(line)
val b = new Book("Programming Scala", "Martin Odersky", 20.5)

println(b)
println(b2)
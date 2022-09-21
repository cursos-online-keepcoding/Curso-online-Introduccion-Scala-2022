class Book(var title: String,
          var author: String,
          var price: Double) {

  // constructor adicional sin parametros
  def this() {
    this("", "", 0.0)
    println("fin metodo sin parametros")
  }

  // constructor adicional con un parametro
  def this(title: String) {
    this(title, "", 0.0)
    println("fin metodo con un parametro")
  }
  override def toString: String = s"$title - $author - $price"
}

val b = new Book("Programming Scala", "Martin", 30.0)
val c = new Book()
val d = new Book("Programming Scala")

// mejor usar valores por defecto o companion objets
class Book(var title: String,
           var author: String = "",
           var price: Double = 0.0)
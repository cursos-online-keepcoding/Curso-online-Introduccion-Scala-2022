// superclase
class Publication(
                 val title: String,
                 val price: Double
                 ) {
  def print: Unit = println(s"Publication '$title' with price $price")
}

//subclase sobreescribiendo print
class Book(title: String,
           val author: String,
           price: Double) extends Publication(title, price) {
  override def print: Unit = println(s"Book '$title' with price $price")
}

// subclase sin sobreescribir nada
class Magazine(title: String,
               val editor: String,
                price: Double) extends Publication(title, price)


val b = new Book("Programming Scala", "Martin Odersky", 30)
val m = new Magazine("Time", "Time inc.", 3)

b.print
m.print
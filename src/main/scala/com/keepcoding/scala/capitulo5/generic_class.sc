case class Message[A](value: A) {
  def concat(other: A): String = value.toString + "-" + other.toString
  def getContent: A = value
  def map[B](f: A => B): Message[B] = Message(f(value))
}

val msg: Message[Long] = Message(12)
val msg2 = Message("KeepCoding")

msg2.concat("Hola!")
msg.getContent

msg2.map(_.toUpperCase())
msg2.map(_.length)

// Si necesitamos usar mas tipos asignamos
// letras distintas
case class Pair[A, B](one: A, two: B)
val pair = Pair(12, "KeepCoding")
val pair2 = Pair("hello!", 2.0)

// Los metodos pueden aceptar clases genéricas:
def printObjet[A](o: A) = println(s"This is it: ${o.toString}")
printObjet(msg)
printObjet(123)
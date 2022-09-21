// companion class
class Calculadora {
  // equivalente a static de Java, la implementacion de la funcion esta en el object
  def sumar(a: Int, b: Int): Int = Calculadora.sumar(a, b)
  def restar(a: Int, b: Int): Int = Calculadora.restar(a, b)
}

// companion object
object Calculadora {
  private def sumar(a: Int, b: Int): Int = a + b
  private def restar(a: Int, b: Int): Int = a - b
}

val c = new Calculadora

c.sumar(1, 2)
c.restar(2, 2)
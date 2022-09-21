// objeto singleton
object Calculadora {
  def suma(a: Int, b: Int): Int = a + b
  def resta(a: Int, b: Int): Int = a - b
}

Calculadora.suma(1, 2)
Calculadora.resta(3, 4)
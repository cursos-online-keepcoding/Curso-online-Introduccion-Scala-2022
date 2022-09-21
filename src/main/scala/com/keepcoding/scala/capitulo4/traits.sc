// trait con metodos abstractos
trait ConMotor {
  def arrancar: Unit
}
// trait con metodos implementados
trait ConPedales {
  def pedalear: Unit = println("Empezar a pedalear")
}
// trait sin metodos
trait ConRuedas

// vehiculos con caracteristicas asignadas gracias a los traits
class Vehiculo
class Coche extends Vehiculo with ConMotor with ConRuedas {
  override def arrancar: Unit = println("Arrancar Motor")
}
class Bicicleta extends Vehiculo with ConRuedas with ConPedales

val b = new Bicicleta
val c = new Coche

// ejemplo de uso con match
def arrancar(v: Vehiculo): Unit = v match {
  case v: ConPedales => v.pedalear
  case v: ConMotor => v.arrancar
  case _ => println("No se arrancarlo")
}

arrancar(b)
arrancar(c)

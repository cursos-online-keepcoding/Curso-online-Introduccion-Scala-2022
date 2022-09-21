sealed trait Respuesta {
  val message: String
}
case class Si(message: String) extends Respuesta
case class No(message: String) extends Respuesta
case object Desconocido extends Respuesta {
  override val message = "NS/NC"
}

val s = Si("Estoy totalmente de acuerdo")
val n = No("No estoy de acuerdo")
val d = Desconocido

def procesaRespuesta(respuesta: Respuesta): Unit = respuesta match {
  case Si(msg) => println(s"Respuesta Si, con mensaje: $msg")
  case No(msg) => println(s"Respuesta No, con mensaje: $msg")
  case Desconocido => println(s"Respuesta: ${Desconocido.message}")
}

procesaRespuesta(s)
procesaRespuesta(n)
procesaRespuesta(d)
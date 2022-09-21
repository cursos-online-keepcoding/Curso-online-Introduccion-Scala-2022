case class Person(name: String,
                  age: Int,
                  phone: Option[String])

case class House(city: String,
                 owner: Option[Person],
                 address: Option[String])

val p = Person("John", 22, Some("5555202020"))
val h = House("London", Some(p), None)

// map, aplica funcion al contenido de un option
p.phone.map(_.substring(0,3) + "******")

// flatten: para desenvolver si tenemos Options anidados
val ownerPhone = h.owner.map(_.phone)
val ownerPhone = h.owner.map(_.phone).flatten


// flatMap combina una llamada a map y a flatten
val ownerPhone = h.owner.flatMap(_.phone)
  .map(_.substring(0,3) + "******")

// finalmente podemos obtener el contenido de phone
// No nos hemos tenido que preocupar de si
// el option es None o no hasta ahora
ownerPhone match {
  case Some(p) => println(p)
  case None => println("No phone")
}
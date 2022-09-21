case class Person(name: String, age: Int)

// companion object with apply
val person = Person("Juan", 25)

// getters
person.name
person.age

// copy
val persona2 = person.copy(name = "Mark")
persona2.name

// override de toString, hashCode y equals
person.toString
Person("Juan", 2).hashCode() == Person("Juan", 2).hashCode()
Person("Juan", 2).equals(Person("Juan", 2))

// companion object with unapply
Person.apply("Juan", 25)
Person.unapply(person).get

// pattern matching
Person("Juan", 17) match {
  case Person(name, _) if name.equals("Mark") => println("tiene pase vip")
  case p @ Person(_, age) if age >= 18 => println(s"${p.name} es mayor de edad")
  case Person(_ , _) => println("No puede entrar")
}
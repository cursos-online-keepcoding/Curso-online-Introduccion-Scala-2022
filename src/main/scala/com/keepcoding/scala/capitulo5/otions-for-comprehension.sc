case class Person(name: String,
                  age: Int,
                  phone: Option[String])

case class House(city: String,
                 owner: Option[Person],
                 address: Option[String])

val p = Person("John", 22, Some("5555202020"))
val h = House("London", Some(p), None)

// A veces anidar flatMaps puede ser poco legible y
// dificil de mantener
def ownerPhone(optHouse: Option[House]): Option[String] =
  optHouse.flatMap{ house =>
    house.owner.flatMap { person =>
      person.phone
    }
  }

ownerPhone(Some(h))

// Podemos reimplementar la funcion con for-Comprehension
def ownerPhoneFor(optHouse: Option[House]): Option[String] =
  for {
    house <- optHouse if house.city != "London" // Podemos usar condiciones
    owner <- house.owner
    phone <- owner.phone
  } yield phone

ownerPhoneFor(Some(h))
ownerPhoneFor(Some(h.copy(city = "Manchester")))

// Estos son los metodos mas usados de los options
Some(1).isDefined
None.isDefined

Some(1).isEmpty
None.isEmpty

Some(1).getOrElse(10)
None.getOrElse(10)

Some(10).find(_ == 10)
Some(10).find(_ == 9)

Some(10).exists(_ == 10)
Some(10).exists(_ == 9)

Some(10).contains(10)
Some(10).contains(9)
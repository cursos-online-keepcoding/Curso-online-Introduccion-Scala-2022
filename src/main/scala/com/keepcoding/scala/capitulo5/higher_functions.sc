val str = "keepCoding123"

str.count(c => c.isDigit)

def myCount(s: String, condicion: Char => Boolean) =
  s.count(condicion)

myCount("keepcoding1234", _.isDigit)
myCount("KEEPcoding1234", _.isUpper)

def myCondicion(modo: String): Char => Boolean = modo match{
  case "digit" => _.isDigit
  case "upper" => _.isUpper
  case _ => (_ => true)
}

myCount("keepcoding12", myCondicion("digit"))
myCount("keepCoding12", myCondicion("upper"))
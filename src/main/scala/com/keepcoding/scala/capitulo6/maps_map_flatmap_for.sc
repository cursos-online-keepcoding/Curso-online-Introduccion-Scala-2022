val currencies = Map("USA" -> "USD", "Mexico" -> "MXN", "Spain" -> "EUR", "France" -> "EUR")

// map
currencies.map(tuple => tuple._1 -> tuple._2)
currencies.map{ case (k, v) => k -> v }
currencies.map{ case (k, v) => v -> k }
val lst = currencies.map{ case (k, v) => s"country $k has currency $v" }
lst.mkString("\n")

// flatMap
currencies.flatMap{ case (k, v) => Map(k -> v)}
currencies.flatMap{ case (k, v) => List(k, v)}
currencies.flatMap{ case (k, v) => if(v.equals("EUR")) Some(k -> v) else None}
currencies.flatMap{ case (k, v) => if(v.equals("EUR")) Some(s"$k - $v") else None}


// for-comprehension
for {
  (k, v) <- currencies
  if v.equals("EUR")
} yield k -> v

for {
  (k, v) <- currencies
  if v.equals("EUR")
} yield s"$k - $v"
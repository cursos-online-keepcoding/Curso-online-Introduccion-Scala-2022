lazy val x: Int = {
  println("building x")
  10
}

println(x)
println(x)
println(x)

lazy val condition: Boolean = {
  println("Building condition")
  true
}
val conditionFalse = false

println(
  if(conditionFalse && condition) "Yes" else "No"
)


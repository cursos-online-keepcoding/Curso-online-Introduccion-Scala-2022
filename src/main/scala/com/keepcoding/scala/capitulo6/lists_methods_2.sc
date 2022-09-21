val strings = List("keep", "coding", "scala", "functional")
val nums = List(1, 2, 3, 4, 5)

// map
strings.map(_.toUpperCase)
nums.map(_ * 2)

// filter
strings.filter(_.contains("l"))
nums.filter(_ % 2 == 0)

// foreach
strings.foreach(println)

// take y takeWhile
nums.take(3)
strings.take(2)

nums.takeWhile(_ < 2)
List(1, 2, 3, 2, 1).takeWhile(_ < 3)

// drop y dropWhile
nums.drop(2)
nums.dropRight(2)
nums.dropWhile(_ < 3)
List(1, 2, 3, 2, 1).dropWhile(_ < 3)

// reduce
nums.reduce((acc, curr) => acc + curr)
nums.reduce {
  (acc, curr) =>
    println(s"aacumulate: $acc - current: $curr => acc + curr = ${acc + curr}")
    acc + curr
}

// fold y foldLeft
nums.fold(50)((acc, curr) => acc + curr)
strings.fold("-")((acc, curr) => acc + curr)

nums.foldLeft("-")((acc, curr) => acc + ", " + curr)

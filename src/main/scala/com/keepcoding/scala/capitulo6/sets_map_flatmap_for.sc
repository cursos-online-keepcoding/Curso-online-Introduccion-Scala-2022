case class Author(id: Int, name: String, tags: Set[String])
val authors = Set(
  Author(1, "Daniela Sfregola", Set("Programming", "Scala")),
  Author(2, "Dean Wampler", Set("Programming", "Scala")),
  Author(3, "Martin Odersky", Set("Programming", "Scala", "Functional"))
)

// map
def getAuthorsNames(authors: Set[Author]): Set[String] =
  authors.map(_.name)

getAuthorsNames(authors)

def getAuthorsTags(authors: Set[Author]): Set[Set[String]] =
  authors.map(_.tags)

val tags = getAuthorsTags(authors)

// flatten
tags.flatten

// flatMap
def getAuthorsTags(authors: Set[Author]): Set[String] =
  authors.flatMap(_.tags)

getAuthorsTags(authors)

def creaSilabas(consonantes: Set[String], vocales: Set[String]): Set[String] =
  consonantes.flatMap{ c =>
    vocales.map {v =>
      s"$c$v"
    }
  }

creaSilabas(Set("b", "c", "d"), Set("a", "e", "i", "o", "u"))

// for-comprehension
def creaSilabas(consonantes: Set[String], vocales: Set[String]): Set[String] =
  for {
    c <- consonantes
    v <- vocales
  } yield s"$c$v"

creaSilabas(Set("b", "c", "d"), Set("a", "e", "i", "o", "u"))

def getTagsByIds(authors: Set[Author], ids: Set[Int]): Set[String] =
  for {
    a <- authors
    id <- ids if a.id == id
    tags <- a.tags
  } yield tags

getTagsByIds(authors, Set(1))
// Hacer que sea posible que se escriba por consola un texto y despues que se escriba a un fichero
// intentar que no se duplique codigo lo maximo posible

import java.io.PrintWriter
/**
new PrintWriter("/home/agutierrez/keepcoding/curso_scala/scala_worksheets/src/main/scala/capitulo5/solution.txt")
{ write(str); close }
**/

def printConsole(s: String): Unit = println(s)
def printFile(s: String): Unit = {
  new PrintWriter("/home/agutierrez/keepcoding/curso_scala/scala_worksheets/src/main/scala/capitulo5/solution.txt")
  { write(s); close }
}

def printSomething(s: String, printer: String => Unit) = printer(s)

printSomething("el texto a imprimir", printConsole)
printSomething("el texto a imprimir", printFile)
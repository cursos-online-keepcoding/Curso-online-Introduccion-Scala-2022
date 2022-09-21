/**
Iterator               <=>     java.util.Iterator
Iterator               <=>     java.util.Enumeration
Iterable               <=>     java.lang.Iterable
Iterable               <=>     java.util.Collection
mutable.Buffer         <=>     java.util.List
mutable.Set            <=>     java.util.Set
mutable.Map            <=>     java.util.Map
mutable.ConcurrentMap  <=>     java.util.concurrent.ConcurrentMap
 */

import collection.JavaConverters._
import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

val jul: java.util.List[Int] = ArrayBuffer(1, 2, 3).asJava
jul.asScala
val m: java.util.Map[String, Int] = mutable.HashMap("abc" -> 1, "hello" -> 2).asJava


/**
Seq           =>    java.util.List
mutable.Seq   =>    java.util.List
Set           =>    java.util.Set
Map           =>    java.util.Map
 */

val jul = List(1, 2, 3).asJava
jul.add(7)
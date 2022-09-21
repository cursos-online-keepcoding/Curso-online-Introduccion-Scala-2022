package com.keepcoding.scala.capitulo7

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

case class Product(id: Int, name: String)
case class StoreStock(idStore: String, product: Product, stock: Int)

object WebStore {
  val products = Map(
    0 -> "unknown product",
    1 -> "apple",
    2 -> "banana",
    3 -> "orange"
  )
  val stock = Map(
    "store-1" -> Map(1 -> 12, 2 -> 2, 3 -> 42),
    "store-2" -> Map(1 -> 33, 2 -> 22, 3 -> 24),
    "store-3" -> Map(1 -> 22, 2 -> 44, 3 -> 39)
  )

  // método asincrono que nos devuelve un Product
  def getProduct(id: Int): Future[Product] = Future {
    Thread.sleep(300)
    Product(id, products(id))
  }

  // método asíncrono que nos devuelve el stock de un Product en un idStore
  def getStoreStock(idStore: String, product: Product): Future[StoreStock] = Future {
    Thread.sleep(300)
    StoreStock(idStore, product, stock(idStore)(product.id))
  }
}

object FuturesFunctional extends App {
  val productId = 1
  val storeId = "store-1"

  // Futuros anidados con pattern matching
  val product = WebStore.getProduct(productId)
  product.onComplete{
    case Success(p) =>
      val stock = WebStore.getStoreStock(storeId, p)
      stock.onComplete{
        case Success(stock) => println(s"in store '${stock.idStore}' there is ${stock.stock} of ${stock.product.name}")
        case Failure(ex) => ex.printStackTrace()
      }
    case Failure(ex) => ex.printStackTrace()
  }


  // Futuros concatenados con map, flatmap y filter
  val appleName = WebStore.getProduct(productId).map(p => p.name)
  val appleStock = WebStore.getProduct(productId).flatMap(p => WebStore.getStoreStock(storeId, p))
  val apples = appleStock.filter(s => s.stock >= 10)

  apples.onComplete {
    case Success(stock) => println(s"in store '${stock.idStore}' there is ${stock.stock} of ${stock.product.name}")
    case Failure(ex) => ex.printStackTrace()
  }

  // Futuros con for-comprehension
  val appleStockFor = for {
    appleP <- WebStore.getProduct(productId)
    appleS <- WebStore.getStoreStock(storeId, appleP)
    if (appleS.stock >= 10)
  } yield appleS

  appleStockFor.onComplete {
    case Success(stock) => println(s"in store '${stock.idStore}' there is ${stock.stock} of ${stock.product.name}")
    case Failure(ex) => ex.printStackTrace()
  }

  // Fallbacks
  // Fallback sincrono. Creamos un Product
  val nonExistsProduct = WebStore.getProduct(-1).recover{
    case ex: Throwable => Product(0, "unknown product")
  }

  // Fallback asincrono. Creamos un Future[Product]
  val nonExistsProduct2 = WebStore.getProduct(-1).recoverWith {
    case ex: Throwable => WebStore.getProduct(0)
  }

  // Si no queremos controlar ningun error y siempre hacer el Future[Product]
  val nonExistsProduct3 = WebStore.getProduct(-1).fallbackTo(WebStore.getProduct(0))

  nonExistsProduct3.onComplete{
    case Success(p) => println(p)
    case Failure(ex) => ex.printStackTrace()
  }

  Thread.sleep(3000)
}

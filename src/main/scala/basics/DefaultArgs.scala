package basics

import scala.annotation.tailrec

object DefaultArgs extends App {

  @tailrec
  def trFact(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else trFact(n - 1, n * acc)

  val fact10 = trFact(10)

  def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 800): Unit = println("saving picture")
  savePicture() // if the parameters have default value, you can pass nothing
  savePicture(width = 800) // you can also specify which value you want to override

  // Otherwise, you cannot omit the leading arguments else the compiler will throw error out
  def greeting(greet: String = "Hi", name: String): Unit = println(greet + " ," + name)
  greeting("Hi", "John")
  // Error happens because compiler will assume John is greeting
  // greeting("John")
  greeting(name = "John") // This works
}

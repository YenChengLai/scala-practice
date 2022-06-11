package OOP
import scala.language.postfixOps


object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String) {
     def likes(movie: String): Boolean = movie == favoriteMovie
     def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
     def unary_! : String = s"$name, what the heck?!"
     def isAlive: Boolean = true
     def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  // infix notation = operator notation (syntaxtic sugar)
  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent


  // "operators" in Scala
  val tom = new Person("Tom", "Fight club")
  println(mary + tom)
  println(mary.+(tom)) // equivalent

  // ALL OPERATORS ARE METHODS !!!

  // prefix notation
  val x = -1
  val y = 1.unary_-  // equivalent
  // unary_ prefix only workd with - + ~ !

  println(!mary)
  println(mary.unary_!)

  // postfix notation
  println(mary.isAlive)
  println(mary isAlive) // equivalent

  // apply
  println(mary.apply())
  println(mary()) // equivalent
}

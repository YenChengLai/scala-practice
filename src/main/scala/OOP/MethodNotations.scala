package OOP

import scala.language.postfixOps


object MethodNotations extends App {

  class Person(val name: String, favoriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)

    def unary_! : String = s"$name, what the heck?!"

    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"

    def learnsScala = this learns ("Scala")
  }

  // infix notation = operator notation (syntaxtic sugar)
  // Only works for method with 1 parameter
  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent


  // "operators" in Scala
  val tom = new Person("Tom", "Fight club")
  println(mary + tom)
  println(mary.+(tom)) // equivalent

  // ALL OPERATORS ARE METHODS !!!

  // prefix notation
  // unary_ prefix only allowed for - + ~ !
  val x = -1
  val y = 1.unary_- // equivalent

  println(!mary)
  println(mary.unary_!) // equivalent

  // postfix notation
  // Only for methods without parameters
  println(mary.isAlive)
  println(mary isAlive) // equivalent

  // apply
  println(mary.apply())
  println(mary()) // equivalent


  /*
    1. Overload the + operator
        mary + "the rockstar" => new person "Mary (the rockstar)"

    2. Add an age to the Person class
       Add a unary + operator => new person with the age + 1
       +mary => mary with the age incrementer

    3. Add a "learns" method in the Person class => "Mary learns Scala"
       Add a learnsScala method, calls learns method with "Scala"
       Use it in a postfix notation

    4. Overload the apply method
       mary.apply(2) => "Mary watched Inception 2 times"
  */

  println((mary + "the Rockstar") ())
  println((mary + "the Rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary(10))
}

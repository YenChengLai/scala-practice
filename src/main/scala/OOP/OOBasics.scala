package OOP

object OOBasics extends App {

  val person = new Person("Frank", 30)
  println(person.age)
  person.greet("John")
  person.greet()

  val john = new Person("John")
  john.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(imposter))


  val counter = new Counter
  counter.increment.print
}

// constructor
// class parameters are NOT fields
// you need to add val to turn it into fields
class Person(name: String, val age: Int) {
  // body
  val x = 2 // val parameters are fields

  // method
  def greet(name: String): Unit = println(s"${this.name} says: Hi, $name!")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name!")

  // multiple constructors
  def this(name: String) = this(name, 0)

  def this() = this("John Doe")
}

/*
  Novel and a Writer

  Writer: first name, surname, year
    - method fullName

  Novel: name, year of release, author
    - authorAge
    - isWrittenBy(author)
    - copy (new year of release) = new instance of Novel

*/
class Writer(firstName: String, surname: String, val year: Int) {

  def fullName(): String = this.firstName + " " + this.surname
}

class Novel(name: String, yearOfRelease: Int, var author: Writer) {

  def authorAge: Int = yearOfRelease - this.author.year

  def isWrittenBy(author: Writer): Boolean = this.author == author

  def copy(yearOfRelease: Int): Unit = new Novel(this.name, yearOfRelease, this.author)

}


/*
  Counter class
    - receives an int value
    - method current count
    - method to increment/decrement -> new Counter
    - overload inc/dec to receive an amount
*/

class Counter(val value: Int = 0) {

  def currentCount: Int = this.value

  def increment: Counter = {
    new Counter(this.value + 1)
  }

  def decrement: Counter = {
    new Counter(this.value - 1)
  }

  def increment(amount: Int): Counter = {
    if (amount <= 0) this
    else increment.increment(amount - 1)
  }

  def decrement(amount: Int): Counter = {
    if (amount <= 0) this
    else decrement.decrement(amount - 1)
  }

  def print: Unit = println(value)
}

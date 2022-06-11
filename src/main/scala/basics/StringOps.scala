package basics

object StringOps extends App {

  val str: String = "Hi, I am Frank"

  // Java similar operations
  println(str.charAt(2))
  println(str.substring(7))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hi,"))
  println(str.replace(" ", "||"))
  println(str.toLowerCase())
  println(str.length)

  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'b') // :+ +: prepending and appending operators
  println(str.reverse)
  println(str.take(2))

  // Scala specific: String Interpolator

  // S-interpolator
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old."
  val anotherGreeting = s"Hello my name is $name and I will be turning ${age + 1} years old."

  println(greeting)
  println(anotherGreeting)

  // F-interpolator
  val speed = 1.31415926535f
  val myth = f"$name%s can eat $speed%2.2f burgers per minute."
  println(myth)

  // $ means the variable for interpolation and % means the format
  // %s means String
  // %f means float 2.2 means => 2 characters total, minimum  and  2 decimals precision


  // raw interpolator
  println(raw"This is a \n newline.") // \n won't get escaped
  val escaped = "This is a \n newLine"
  println(raw"$escaped") // This do get escaped
}

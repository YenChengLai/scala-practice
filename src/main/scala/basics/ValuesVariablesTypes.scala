package basics

object ValuesVariablesTypes extends App {

  // vals are immutable, once assigned cannot change its value (constants)
  val x: Int = 99  // Types of vals are optional, compiler can infer types
  println(x)

  val aString: String = "Hello World";  // semicolon are not required if there's only one expression in one line
  val anotherString: String = "Hello Again";

  val aBoolean : Boolean = false;
  val aChar: Char = 'a'
  val anInt: Int = 55
  val aShort: Short = 32767
  val aLong: Long = 2147483648L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.141596726535

  // variables
  var aVariable: Int = 4
  aVariable = 6 // variables' values can be changed (side effects)
}

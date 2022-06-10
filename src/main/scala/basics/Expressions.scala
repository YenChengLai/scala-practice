package basics

object Expressions extends App {

  // Basic Expressions : Operators
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 == x))
  // unary & logical operator: ! && ||

  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  // Imperative vs Declarative
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // if Expression
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)

  // This is Imperative, not recommended in Scala
  // Don't write like this!!!
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // Everything is Scala should be an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // Side effects: println(), whiles, reassigning, etc...
  // These are expressions returning Unit

  // Code Blocks: (are also expressions in Scala)
  // (1) The value of the code block depends on its last expression.
  // In this case, it is the string hello
  // (2) Everything in the code block is only visible inside.

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // 1. What is the difference between "hello World" and println("hello World")
  // The former one is type string
  // The latter one is an expression and a side effect, which has a type Unit
  // 2. What is the value of the below code blocks
  val someValue = {
    2 < 3 // Last Expression, returns a boolean
  }

  println(someValue)

  val someOtherValue = {
    if (someValue) 222 else 333
    42 // Last Expression, returns 42
  }

  println(someOtherValue)

}

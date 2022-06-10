package basics

object Functions extends App {

  // Syntax : def (reserved word) + function name
  // + (parameter types) + return type + = + expression (it's OK without {})
  def aFunction(a: String, b: String): String = {
    a + " " + b
  }

  println(aFunction("Hello", "World"))


  // When declaring a function without parameters, you can
  // (1) declare it with parenthesis => call it with parenthesis
  // (2) declare it without parenthesis => call it without parenthesis
  // Scala 2 allows developers to mix them, but 3 doesn't
  def aParameterlessFunction: Int = 5

  println(aParameterlessFunction)

  // Use recursion instead of loop
  // Curly braces can be removed based on indent (like Python)
  def aRepeatedFunction(aString: String, n: Int): String =
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)

  println(aRepeatedFunction("Hi", 5))

  // Functions can return Unit as well, often used when no return type needed
  // e.g. print data, write log
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)
  }

  /*
  1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old."
  2. Factorial function 1 * 2 * 3 * .. * n
  3. A Fibonacci function
  4. Tests if a number is prime
  */

  def greeting(name: String, age: Int): String =
    "Hi, my name is " + name + " and I am " + age + " years old."

  println(greeting("Frank", 29))

  def factorial(n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)

  println(factorial(5))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(6))

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(13))
}

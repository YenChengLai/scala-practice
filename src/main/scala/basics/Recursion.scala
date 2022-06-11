package basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - 1 first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION - use recursive call as the LAST expression

    factHelper(n, 1)
  }

  /**
   * anotherFactorial(10) - factHelper(10, 1)
   */
  println(anotherFactorial(5000))

  // USE TAIL RECURSION WHEN YOU NEED LOOP

  /**
   * 1. Concatenate a string n times
   * 2. IsPrime function tail recursive
   * 3. Fibonacci tail recursive
   */

  @tailrec
  def concatString(str: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatString(str, n - 1, accumulator + str)

  println(concatString("Hi", 5, ""))

  def isPrime(n: Int): Boolean =
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailRec(n / 2, true)


  println(isPrime(13))
  println(isPrime(12))

  def fibonacci(n: Int, n2: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)

  println(fibonacci(6))

  def fibonacci(n: Int): Int = {
    @tailrec
    def fiboTailRec(i: Int, last: Int, nextLast: Int): Int =
      if (i >= n) last
      else fiboTailRec(i + 1, last + nextLast, last)

    if (n <= 2) 1
    else fiboTailRec(2, 1, 1)
  }

  println(fibonacci(8))

}

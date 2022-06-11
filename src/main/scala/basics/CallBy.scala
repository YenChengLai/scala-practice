package basics

object CallBy extends App {

  def calledByValue(x: Long): Unit =
    println("by value:" + x)
    println("by value:" + x)

  // => arrow function means to call by name
  def calledByName(x: => Long): Unit =
    println("by name:" + x)
    println("by name:" + x)

  calledByValue(System.nanoTime())
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int): Unit = println(x)

  printFirst(infinite(), 34) // This will cause stackoverflow error
  printFirst(34, infinite()) // This will work perfectly fine


  // Key Takeaway:
  // (1) Call by value:
  //     pass the value to the function
  //     value is computed before called
  //     same value used everywhere
  // (2) Call by name:
  //     pass the EXPRESSION to the function
  //     expression is evaluated at every use within
  
}

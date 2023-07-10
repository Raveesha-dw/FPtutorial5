package demo

import scala.io.StdIn.readInt

object test4 {
  var n1 = 0
  var n2 = 1
  def fibonacci(n: Int): Unit={
    var n3 = 0

    if (n>0){
      n3 = n1 + n2
      n1 = n2
      n2 = n3
      print(" " + n3)
      fibonacci(n-1)
    }
  }
  def main(args: Array[String]): Unit = {
    println("Fibonacci Series. Input n")
    var n = readInt()
    print("0 1")
    fibonacci(n-2)

  }

}

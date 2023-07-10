package demo

object test3 {
  def EvenOdd(n: Int): Boolean={
    if (n==0) true
    else if (n==1) false
    else if (n>1) EvenOdd(n-2)
    else EvenOdd(n-1)
  }

  def main(args: Array[String]): Unit = {
    println("If even outputs 'True', If odd 'False'")
    println("22 : "+ EvenOdd(22))
    println("7 : "+ EvenOdd(7))
    println("10 : "+ EvenOdd(10))
  }
}
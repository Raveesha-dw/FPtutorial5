package demo

object test3 {
  def AdditionOfEven(n: Int): Int={
    if (n<=0) 0
    else if(n%2 ==0)
      n + AdditionOfEven(n-2)
    else AdditionOfEven(n-1)
  }

  def main(args: Array[String]): Unit = {
    println("Addition of Even numbers less than, ")
    println("5 = "+AdditionOfEven(5))
    println("8 = "+AdditionOfEven(8))
    println("14 = "+AdditionOfEven(14))
  }
}
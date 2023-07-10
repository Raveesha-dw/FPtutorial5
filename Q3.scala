package demo

object test3 {
  def sum(n:Int): Int={
    if (n==1) 1
    else n + sum(n-1)
  }

  def main(args: Array[String]): Unit = {
    println(sum(5))
    println(sum(8))
  }
}
package demo

object test {
  def prime(n: Int): Boolean = {
    def checkDivisible(a: Int, b: Int): Boolean = {
      if (b<=1) false
      else if (a%b ==0) true
      else checkDivisible(a,b-1)
    }

    if(n<=1) false
    else if (n==2) true
    else !checkDivisible(n,n-1)

  }

  def main(args: Array[String]): Unit = {
    println(prime(5))
    println(prime(8))
  }

}

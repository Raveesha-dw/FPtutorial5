package demo

object test2 {
  def primeSeq(n: Int): Unit = {
    def isPrime(k: Int, i: Int): Boolean =
      if (i <= 1) true
      else if (k % i == 0) false
      else isPrime(k, i - 1)

    def printPrimes(k: Int): Unit = {
      if (k < n) {
        if (isPrime(k, k - 1)) {
          print(s"$k ")
        }
        printPrimes(k + 1)
      }
    }

    printPrimes(2)
  }

  def main(args: Array[String]): Unit = {
    primeSeq(5)
    println()
    primeSeq(15)
  }

}

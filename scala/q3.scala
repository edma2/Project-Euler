object Test {
    def largestPrimeFactor(n: BigInt): BigInt = {
        var i: BigInt = 2
        while (i < n) {
            if (n % i == 0) {
                println(n + " is divisible by " + i)
                return largestPrimeFactor(n/i)
            }
            i += 1
        }
        n
    }

    def main(args: Array[String]) {
        println(largestPrimeFactor(BigInt("600851475143")))
    }
}

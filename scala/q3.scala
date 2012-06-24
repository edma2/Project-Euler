object Test {
    /** Get the largest prime factor of n.
     * A prime n is only divisible by 1 and itself, so search for a divisor from
     * 2 until n. If a divisor isn't found, then n is prime, so the largest
     * prime factor is n itself. If a divisor is found, then factor out the
     * divisor and call myself recursively. */
    def largestPrimeFactor(n: BigInt): BigInt = {
        var i: BigInt = 2
        /* Note: cannot use for(i <- BigInt(2) until n) syntax here due to limit
         * on sequence size */
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

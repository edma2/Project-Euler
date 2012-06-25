object Test {
    /** True if n divides all divisors evenly. */
    def dividesEvenly(n: BigInt, divisors: Seq[Int]) = {
        (divisors filter {n % _ != 0}).size == 0
    }

    def main(args: Array[String]) {
        var divisors = 1 to 20

        // We know initially that 20! is divisible by all divisors.
        var answer: BigInt = divisors.map({BigInt(_)}).product

        // Factor out as many divisors as we can from largest to smallest.
        for (d <- divisors reverse) {
            if (dividesEvenly(answer/d, divisors)) {
                answer /= d
            }
        }
        println(answer)
    }
}

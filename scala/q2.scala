object Test {
    val fibs: Stream[BigInt] = BigInt(0) #:: BigInt(1) #:: fibs.zip(fibs.tail).map({case (a,b) => a+b})

    def main(args: Array[String]) {
        println(fibs filter {n => n % 2 == 0} takeWhile {n => n < 4000000} sum)
    }
}

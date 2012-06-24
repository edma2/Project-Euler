object Test {
    def isPalindrome(s: String): Boolean = s.reverse == s
    def isPalindrome(n: Int): Boolean = isPalindrome(n.toString)

    def main(args: Array[String]) {
        val products = 100 to 999 map {i => 100 to 999 map {j => i*j}} flatten
        println(products filter {p => isPalindrome(p)} max)
    }
}

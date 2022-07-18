package task40

fun main() {
    val string = (0..1000000).joinToString("")
    println(string[1].digitToInt()
            * string[10].digitToInt()
            * string[100].digitToInt()
            * string[1000].digitToInt()
            * string[10_000].digitToInt()
            * string[100_000].digitToInt()
            * string[1_000_000].digitToInt())

}

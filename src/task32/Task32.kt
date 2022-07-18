package task32

fun main() {
    val set = mutableSetOf<Int>()
    for (i in 1..9876) {
        for (j in i + 1..9876) {
            set += i isDifference j
        }
    }

    println(set.sum())
}

infix fun Int.isDifference(second: Int): Int {
    val multiply = this * second
    val number = "$this$second$multiply"
    return if (number.length == 9 && !number.contains("0") && number.chars().distinct().count().toInt() == number.length) multiply else 0
}
package task28

fun main() {
    val size = 1001
    var sum = 1L
    var prev = 1L

    for (i in 1..(size - 1)/2) {
        for (j in 1..4) {
            prev += 2 * i
            sum += prev
        }
    }

    println(sum)
}
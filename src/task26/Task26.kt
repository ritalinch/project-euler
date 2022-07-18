package task26

fun main() {
    var max = 0
    var maxCounter = 0
    for(i in 2..1000) {
        val len = getSequenceLength(i)
        if (maxCounter < len) {
            max = i
            maxCounter = len
        }
    }

    println(max)
}

fun getSequenceLength(number: Int): Int {
    var n = 10
    val numbers = mutableSetOf<Int>()
    while (!numbers.contains(n)) {
        numbers.add(n)
        if (n < number) {
            n *= 10
        }
        else {
            n = n%number * 10
        }
    }
    return numbers.size - numbers.indexOfFirst { elem -> elem == n }
}
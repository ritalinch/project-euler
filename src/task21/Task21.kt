package task21

import kotlin.math.sqrt

fun main() {
    var sum = 0
    for(i in 2 until 10000) {
        if (i == countDivisorsSum(countDivisorsSum(i)) && i != countDivisorsSum(i)) {
            sum += i
        }
    }

    println(sum)
}

private fun countDivisorsSum(number: Int) : Int {
    if (number == 2) {
        return 1
    }

    var sum = 1
    val root = sqrt(number.toDouble())
    for(i in 2..root.toInt() + 1) {
        if (number % i == 0) {
            sum += i + number / i
        }
    }

    if (root.toInt() * root.toInt() == number) {
        sum -= root.toInt()
    }
    return sum
}
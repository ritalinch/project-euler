package task23

import kotlin.math.sqrt

fun main() {
    val size = 28124
    val arr = Array(size) { i -> isAbundant(i) }
    var sum = 0L

    for(i in 3 .. size) {
        var flag = false
        for(j in 1 until i) {
            if (arr[j] && arr[i - j]) {
                flag = true
                break
            }
        }

        if (!flag) {
            sum += i
        }
    }

    println(sum + 3)
}

private fun isAbundant(number: Int): Boolean {
    if (number == 2) {
        return false
    }

    var sum = 1
    val root = sqrt(number.toDouble()).toInt()
    for(i in 2..root) {
        if (number % i == 0) {
            sum += i + number / i
        }
    }

    if (root * root == number) {
        sum -= root
    }
    return sum > number
}
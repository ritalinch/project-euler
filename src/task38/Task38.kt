package task38

import java.lang.Long.parseLong

fun main() {
    var max = 0L
    var current = 9L
    do {
        val product = current.to9DigitsConcatenatedProductIfPossible()
        if(product != -1L) {
            max = product
        }

        current++
    } while (current / 100_000 == 0L)

    println(max)
}

fun Long.to9DigitsConcatenatedProductIfPossible() : Long {
    var concatenation = ""
    for(i in 1..9) {
        concatenation += this * i

        if(concatenation.length < 9) {
            continue
        }

        else if(concatenation.length > 9 || concatenation.chars().distinct().count() != 9L || concatenation.contains('0')) {
            return -1
        }

        return parseLong(concatenation)
    }

    return -1
}
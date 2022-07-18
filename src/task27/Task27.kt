package task27

import kotlin.math.sqrt

fun main() {
    var max = 0
    var ans = 1
    for(a in -999 until 1000) {
        for(b in -1000..1000) {
            var n = 0
            while(isPrime(n*n + a*n + b)) {
                n++
            }

            if(max < n) {
                max = n
                ans = a * b
            }
        }
    }

    println(ans)
}

private fun isPrime(number: Int) : Boolean {
    if(number < 2) {
        return false
    }

    for(i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}
package task35

import java.lang.Integer.parseInt
import kotlin.math.sqrt

fun main() {
    var counter = 0
    for(i in 2..1_000_000) {
        if(i.isCircularPrime()) {
            counter++
        }
    }

    println(counter)
}

fun Int.isCircularPrime(): Boolean {
    if(!this.isPrime()) {
        return false
    }

    val stringInt = this.toString()
    for(i in stringInt.length - 1 downTo 1) {
        val reversed = stringInt.substring(i) + stringInt.substring(0, i);
                if(!parseInt(reversed).isPrime()) {
                    return false
                }
    }
    return true
}

fun Int.isPrime(): Boolean {
    if(this < 2) {
        return false
    }

    for(i in 2..sqrt(this.toDouble()).toInt()) {
        if(this%i == 0) return false
    }

    return true
}
package task37

import task35.isPrime
import java.lang.Integer.parseInt

fun main() {
    var current = 11
    var counter = 0
    var sum = 0

    while(counter < 11) {
        if(current.isPrime()
                && current.isTruncatablePrimeFromRightToLeft()
                && current.isTruncatablePrimeFromLeftToRight()){
            sum += current
            counter++
        }

        current++
    }

    println(sum)
}

fun Int.isTruncatablePrimeFromLeftToRight() : Boolean {
    var tmp = this
    while (tmp > 9) {
        tmp /= 10;
        if (!tmp.isPrime()) {
            return false
        }
    }

    return true;
}

fun Int.isTruncatablePrimeFromRightToLeft() : Boolean {
    val stringified = this.toString()
    val len = stringified.length
    for(i in 1 until len) {
        if(!parseInt(stringified.substring(i, len)).isPrime()) {
            return false
        }
    }

    return true
}
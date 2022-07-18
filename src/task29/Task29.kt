package task29

import java.math.BigInteger

fun main() {
    val set = HashSet<BigInteger>()
    for (i in 2..100) {
        for (j in 2..100) {
            set += BigInteger.valueOf(i.toLong()).pow(j)
        }
    }
    println("${set.size}")
}

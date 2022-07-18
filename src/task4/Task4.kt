package task4

import task36.isPalindromic

fun main() {
    var max = 0
    for(a in 100..999) {
        for(b in 100..999) {
            val product = a * b
            if(product > max && product.toString().isPalindromic()) {
                max = product
            }
        }
    }

    println(max)
}
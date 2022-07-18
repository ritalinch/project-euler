package task33

fun main() {
    var multiple = 1
    var multipleUp = 1
    for(i in 10..98) {
        for(j in i..99) {
            val div = i.haveCommon(j)
            if(div != null && div.first.toDouble() / div.second == i.toDouble()/j) {
                multipleUp *= div.first
                multiple *= div.second
            }
        }
    }

    println(multiple / (multiple gcd multipleUp))
}

infix fun Int.gcd( b: Int): Int {
    if(b == 0) {
        return this
    }

    return b.gcd( this % b)
}

fun Int.haveCommon( b: Int): Pair<Int, Int>? {
    val a = this
    if (a%10 == 0 && b%10 == 0) {
        return null
    }
    if(a%10 == b/10 && a/10 != b%10) {
        return a/10 to b%10
    }
    if (a/10 == b%10 && a%10 != b/10) {
        return a%10 to b/10
    }
    if(a%10 == b%10 && a/10 != b/10) {
        return a/10 to b/10
    }
    if (a/10 == b/10 && a%10 != b%10) {
        return a%10 to b%10
    }
    return null
}
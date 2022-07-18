package task34

fun main() {
    var sum = 0
    for(i in 3..10000000) {
        if(i.toLong() == i.factorialOfNumbers()) {
            sum += i
        }
    }
    println(sum)
}

fun Int.factorial(): Long = when (this) {
    in 0..1 -> 1
    else -> this * (this - 1).factorial()
}

fun Int.factorialOfNumbers(): Long {
    return "$this".chars().mapToLong { num -> (num - 48).factorial() }.sum()
}

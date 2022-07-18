package task24

fun main() {
    var lower = 1
    var upper = 1
    val searching = 1_000_000
    for(i in 2..10) {
        upper *= i
    }

    val numbers = (0..9).toMutableList()
    var counter: Int
    var ans = ""
    while(numbers.isNotEmpty()) {
        val step = (upper - lower + 1) / numbers.size
        counter = 0
        for(i in lower ..upper step step ) {
            if (searching >= i && searching < i + step) {
                ans += numbers[counter]
                numbers.remove(numbers[counter])
                lower = i
                upper = i + step - 1
                break
            }

            counter++
        }
    }

    println(ans)
}
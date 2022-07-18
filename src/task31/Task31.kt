package task31

fun main() {
    val coins = listOf(200, 100, 50, 20, 10, 5, 2, 1)
    val mapOfNumbers = Array(8) { 0 }
    var counter = 0
    for (n1 in 0..200 step 200) {
        var coin = 200 - n1
        for (n2 in 0..coin step 100) {
            coin -= 100
            for (n3 in 0..coin step 50) {
                coin -= 50
                for (n4 in 0..coin step 20) {
                    coin -= 20
                    for (n5 in 0..coin step 10) {
                        coin -= 10
                        for (n6 in 0..coin step 5) {
                            coin -= 5
                            for (n7 in 0..coin step 2) {
                                coin -= 2
                                for (n8 in 0..coin step 1) {
                                    coin -=1
                                    counter++
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    //println(task31.recursiveCounter(mapOfNumbers, coins, 0, 0))
    //println(task31.findCoinCombinations(200))
    println(counter)
}

fun findCoinCombinations(coins: Int): Int {
    val coinsArray = arrayOf(1, 2, 5, 10, 20, 50, 100, 200)

    fun recursive(currentCoins: Int, index: Int): Int {
        if (currentCoins == 0 || index == 0)
            return 1

        var counter = 0
        for (c in 0..currentCoins step coinsArray[index]) {
            counter += recursive(currentCoins - c, index - 1)
        }
        return counter
    }

    return recursive(coins, coinsArray.size - 1)
}

private fun recursiveCounter(orderNumbers: Array<Int>, coins: List<Int>, number: Int, counter: Int): Int {
    if (number == 8) {
        var sum = 0
        for (i in coins.indices) {
            sum += orderNumbers[i] * coins[i]
        }
        return if (sum == 200) counter + 1 else counter
    } else {
        var total = 0
        var minus = 0

        for (i in 0 until number) {
            minus += coins[i] * orderNumbers[i]
        }
        println("$number -> $minus")

        for (i in 0..200 - minus step coins[number]) {
            orderNumbers[number]++
            total += recursiveCounter(orderNumbers, coins, number + 1, counter)
        }

        return total
    }
}
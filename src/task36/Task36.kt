package task36

fun main() {
    var sum = 0
    for(i in 1 until 1_000_000) {
        if (i.isBinaryPalindromic()) {
            sum += i
        }
    }

    println(sum)
}

fun Int.isBinaryPalindromic() : Boolean {
    val binaryString = Integer.toBinaryString(this)
    if(binaryString.startsWith("0") || !this.toString().isPalindromic()) return false
    return binaryString.isPalindromic()
}

fun String.isPalindromic() : Boolean {
    val len = this.length
    return if (len % 2 == 0) {
        this.substring(0, len / 2) == this.substring(len / 2).reversed()
    } else {
        this.substring(0, len / 2) == this.substring(len / 2 + 1).reversed()
    }
}
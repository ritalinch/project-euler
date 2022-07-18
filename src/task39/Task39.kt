package task39

fun main() {
    var maxCounter = 0
    var maxPerimeter = 0
    for(i in 11..1000) {
        val current = i.getSolutionsForPerimeter()
        if(current > maxCounter) {
            maxCounter = current
            maxPerimeter = i
        }
    }

    println(maxPerimeter)
}

private fun Int.getSolutionsForPerimeter() : Int {
    var counter = 0

    for(hypotenuse in 1..this/2) {
        val sumOfCathetus = this - hypotenuse
        for(catA in 1 until sumOfCathetus) {
            val catB = sumOfCathetus - catA
            if(hypotenuse <= catA
                    || hypotenuse <= catB) continue

            if(isRightTriangle(catA, catB, hypotenuse)) {
                counter++
            }
        }
    }

    return counter
}

private fun isRightTriangle(a: Int, b: Int, c: Int) : Boolean {
    return c * c == a * a + b * b
}
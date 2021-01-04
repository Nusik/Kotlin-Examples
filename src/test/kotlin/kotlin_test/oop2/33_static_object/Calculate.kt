package kotlin_test.oop2.`33_static_object`

class Calculate {

    companion object {
        const val PI = Math.PI
        fun square(number: Int) = number * number
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}
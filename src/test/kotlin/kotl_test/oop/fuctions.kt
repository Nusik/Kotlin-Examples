package kotl_test.oop

fun main() {

val sum: (Int, Int) -> Int = {k, m -> k + m}
    println(sum(2, 1))

    println(volume(10,4))
}

//подсчитать объем треугольника, в котором сторона А = стороне С
fun volume(a: Int, b: Int = a, c: Int = a) = a * b * c
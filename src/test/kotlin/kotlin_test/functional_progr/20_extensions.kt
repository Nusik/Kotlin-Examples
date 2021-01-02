package kotlin_test.functional_progr

fun main() {
    val name = " "
    if (name.isNotEmpty()) {
        println("extension function")
    }

    val age = 15
    println(age.isPositive())
//одна и та же проверка на возраст происходит в нескольких местах. Чтобы не приходилось каждый раз менять границы значений, create метод:
    if (age.isAgeValid()) {
        println("Valid age")
    }

    //проверка, что число простое и вывод результата в консоли
    println(22.isPrime())
}

//устанавливаем граничные значения для возраста
fun Int.isAgeValid() = this in 6..100
fun Int.isPositive() = this >= 0

//проверить, что число является натуральным
fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}
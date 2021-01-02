package kotl_test.oop

import kotlin.math.min

fun main() {
    println(max(4, 10))           //вывести максимальное из чисел
    println(separate("constanta"))   //по функции separate вывести указанное число первых символов слова (5)
    println(crop("constanta"))       //по функции crop вывести указанное число первых символов слова (5)
    println(sum(1,5,4))        //вывести сумму всех чисел
}

//1. вывод макс числа из двух
fun max(a: Int, b: Int): Int = if (a > b) a else b

//2. на входе есть строка, вывести первые 5ть символов слова.
fun separate(c: String): String = if (c.length >= 5) c.substring(0,5) else c
//второй вариант записи:
fun crop(c: String): String = c.substring(0, min(5, c.length))

//3.sum of numbers
fun sum(vararg numbers: Int): Int {
    var result = 0
    for (num: Int in numbers) {
        result += num
    }
    return result
}



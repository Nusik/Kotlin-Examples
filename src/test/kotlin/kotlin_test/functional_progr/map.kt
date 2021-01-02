package kotlin_test.functional_progr

fun main() {
    val numbers = (0..50).toList()
    val doubleNumbers = numbers.map { it * 2 }
    for (i in doubleNumbers) {
        println(i)
    }

    //преобразовать коллекцию в список сотрудников
    val employees = numbers.map { "Employee №$it" }
    for (employee in employees) {
        println(employee)
    }

    //отсортировать массив/коллекцию
    val array = arrayOf(5, 10, -4, 6, 3)
    val sortedArray = array.sorted()
    for (i in sortedArray)
        println(i)

    //отсортировать коллекцию по убыванию
    val arrayNew = arrayOf(10, -4, 1, 6, 3)
    val sortedArrayDesc = arrayNew.sortedDescending()
    for (j in sortedArrayDesc) {
        println(j)
    }

    println("- - - ")

    //Задача: создать коллекцию чисел от 0 до 1000 размером 1000 элементов
    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000) {
        initArray.add((Math.random() * 1000).toInt())
    }
    //1.оставить только те числа, которые без остатка делятся на 5 или 3
    //2.Каждое число из полученной коллекции возведите в квадрат
    //3.полученную коллекцию отсортируйте по убыванию
    //4.преобразовать в коллекцию элементов типа String

    val result = initArray.filter { it % 5 == 0 || it % 3 == 0 }.map { it * 2 }.sortedDescending().map { "$it" }
    for (i in result)
        println(i)
}
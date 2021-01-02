package kotlin_test.functional_progr

fun main() {
    val array = (0..1000).toList()
    val employee = array.map { "Employee N$it" }

    //вывести только первыми 30 записей
    val first30 = employee.take(30)
    for (employee in first30) {
        println(employee)
    }
    println("---------")

    //вывести только последние 30 записей
    val last30 = employee.takeLast(30)
    for (employee in last30) {
        println(employee)
    }
    println("---------")

    //убрать первые 30 записей из списка и вывести все остальные
    val drop30 = employee.drop(30)
    for (employee in drop30) {
        println(employee)
    }
    println("---------")

    //убрать последние 950 записей из списка и вывести все остальные
    val dropLast = employee.dropLast(950)
    for (employee in dropLast) {
        println(employee)
    }

}
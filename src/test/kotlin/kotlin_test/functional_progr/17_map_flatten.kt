package kotlin_test.functional_progr

//Создать коллекцию, в которой хранятся данные о еженедельной выручке за разные месяцы. В одном из месяцев допущена ошибка и данные с негативным значением.
//создать метод printinfo, который создает отчет и выводит его в консоль

fun main() {
    val data = mapOf(
            "January" to listOf(34, 20, 51, 37, 76),
            "February" to listOf(10, 20, 15, 7, 16),
            "March" to listOf(34, 20, 51, 37, 76),
            "April" to listOf(11, 25, 15, -700, 16),
            "May" to listOf(11, 25, 15, 70, 16)
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val validData = data.filterNot { it.value.any { it < 0 } }
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averageWeek")

    val listOfSum = validData.map { it.value.sum() }
    val maxSum = listOfSum.max()
    val minSum = listOfSum.min()
    val averageMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum() == maxSum }.keys
    val minMonth = validData.filter { it.value.sum() == minSum }.keys

    println("Средняя выручка в месяц: $averageMonth")
    println("MAX выручка в месяц: $maxSum")
    print("Была в следующих месяцах: ")
    for (month in maxMonth) {
        print("$month ")
    }

    println("\nMIN выручка в месяц: $minSum")
    print("Была в следующих месяцах: ")
    for (month in minMonth) {
        print("$month ")
    }

    val invalidData = data.filter { it.value.any { it < 0 } }
    val errorMonth = invalidData.keys
    print("\nОшибки произошли в следующих месяцах: ")
    for (month in errorMonth) {
        print("$month ")
    }


}
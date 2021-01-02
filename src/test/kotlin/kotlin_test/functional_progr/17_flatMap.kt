package kotlin_test.functional_progr

fun main() {
    //создать массив с данными, отражающими выручку в разные дни по неделям
    val revenueByWeek = listOf(
            listOf(1, 2, 5, 7, 6),
            listOf(10, 20, 15, 7, 16),
            listOf(13, 12, 50, 17, 60),
            listOf(11, 25, 15, 70, 16)
    )

    //1 способ - найти среднее значение выручки за день
    val total = mutableListOf<Int>()
    revenueByWeek.map {
        for (i in it) {
            total.add(i)
        }
    }
    val average = total.average()
    println(average)

    //2ой способ - найти среднее значение выручки за день
    val total2 = revenueByWeek.flatten()
    val average2 = total2.average()
    println(average2)

    //Task 2. Создать коллекцию files, в которой хранятся данные о пользователях (age). Подсчитать средний возраст всех людей
    val data = mapOf<String, List<Int>>(
            "file-1" to listOf(15, 20, 46, 12),
            "file-2" to listOf(30, 44, 16, 20),
            "file-3" to listOf(13, 67, 55, 37)
    )
    val averageAge = data.flatMap { it.value }.average()
    println(averageAge)

    //Task 3. В каком-то из файлов ошибочно записали невалидное значение
    val dataFiles = mapOf<String, List<Int>>(
            "file-1" to listOf(15, 20, 46, 12),
            "file-2" to listOf(300, -44, 16, 20),
            "file-3" to listOf(13, 67, 55, 37)
    )
    val avrgAge = dataFiles.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()  //благодаря фильтру file с негативными значениями не будет браться в расчет, т.к не сохранится
    println(avrgAge)

    //2ой способ записи подсчета avrgAge:
    val avrgAges = dataFiles.filterNot { it.value.any { it < 0 } }.flatMap { it.value }.average()

}


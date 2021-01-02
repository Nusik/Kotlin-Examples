package kotlin_test.functional_progr

//бесконечные последовательности

fun main() {
    //1. Сгенерировать массив только с четными числами, начиная с 1го элемента = 0
    val array = generateSequence (0) {
        println("Generated: ${it+2}")
        it + 2}

   //вывести первые 10 четных чисел
    val evenList = array.take(10)
    for(i in evenList)
        println(i)

   //2. Сгенерировать массив только с буквами
    val arrayLetters = generateSequence ('A') {it + 1}
    val letterList = arrayLetters.take(10)
    for(a in letterList)
        println(a)

    //3. Сгенерировать последовательность случайных чисел
    val arrayRandom = generateSequence {
        (Math.random()*100).toInt()}
    val randomList = arrayRandom.take(10)
    for(a in randomList)
        println(a)

    //4. Создать бесконечную последовательность сотрудников со значениями "Сотрудник №1, ...". Вывести на экран первые 100 элементов

    val employees = generateSequence ("Сотрудник №1") {
        val index = it.substring(11).toInt()
        "Сотрудник №${index+1}"
    }
    val listFirst100 = employees.take(100)
    for (employee in listFirst100){
        println(employee)
    }

}
package kotl_test.functional_progr

fun main() {
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    println(sum(5, 4))

    //вычислить квадрат числа - можно вместо переменной а написать ключевое слово it
    val square: (Int) -> Int = { it * it }
    println(square(4))

    //функция, принимающая два параметра прямоугольника и возвращающая его периметр
    val perimetr: (Int, Int) -> Int = {a, b -> (a+b) * 2}
    println(perimetr(2,2))

    //функция, принимающая имя в качестве параметра и ничего не возвращает
    val sayHello: (String) -> Unit = { println("Hello, $it!")}
    sayHello("Inna")

    //функция, принимающая массив чисел в качестве параметра, возвращает массив отсортированный по убыванию
    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0){
            for (j in 0..i) {
                if (it[j] < it[j + 1]){
                    val temp = it[j]
                    it[j] = it[j+1]
                    it[j+1] = temp
                }
            }
        }
        it
    }
    val sortedArray = sort(arrayOf(5,1,-9,7,3,10,75,44))
    for (i in sortedArray){
        println(i)
    }


}
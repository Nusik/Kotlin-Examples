package kotlin_test.functional_progr

fun main() {
val result = modifyString("Hello, World!") { it.toUpperCase() }
    println(result)

    //to Task 2
    val list = (0..100).toList()
    listModifyInt(list){
        println(it.sum())
    }
}

//Task 1
fun modifyString(string: String, modify: (String) -> String) : String {
return modify(string)
}

//Task2. Создать метод, который 1м параметром принимает коллекцию чисел и функцию, которая оперирует данной коллекцией
//Создать коллекцию чисел и с помощью созданного метода ввести сумму всех элементов коллекции

inline fun listModifyInt(list: List<Int>, operator: (List<Int>) -> Unit){ //inline используем при вызове функции высшего порядка, чтобы не создавался объект анонимного класса при вызове метода
operator(list)
}
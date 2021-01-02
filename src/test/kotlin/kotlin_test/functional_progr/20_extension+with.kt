package kotlin_test.functional_progr

fun main() {
    val list = listOf<Int>()
    val string = "Some text"

    myWith(list) {
        sum()
        average()
    }
    myWith(string) {
        println(this.toUpperCase())
    }

    val obj = mutableMapOf<String, String>()
    myWith(obj){
        keys
        values
    }
}

fun myWith(list: List<Int>, operation: List<Int>.() -> Unit) { //расширяем функцию List
    list.operation()
}

fun myWith(string: String, operation: String.() -> Unit) { //расширяем функцию List
    string.operation()
}

//function With, которая будет работать с любыми объектами - параметризированный тип или Generic
//1. Ничего не возвращает
inline fun <T> myWith(list: T, operation: T.() -> Unit) {
    list.operation()
}

//2. Возвращает значение неопределенного типа/ любое
inline fun <T, R> myWith(list: T, operation: T.() -> R) : R {
    return list.operation()
}
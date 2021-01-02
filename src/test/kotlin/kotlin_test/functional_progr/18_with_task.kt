package kotlin_test.functional_progr
//За пределами main создать нулабельную коллекцию чисел. Внутри main заполнить ее случайными числами до 1000.
//Вывести на экран первые 100 четных чисел коллекции (внутри функции with).
//При возникновении ошибок из-за нулабельности коллекции, использовать let

val list: MutableList<Int>? = mutableListOf()

fun main() {
    list?.let {
        with(list) {
            for (i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for (i in result) {
                println(i)
            }
        }
    }
}
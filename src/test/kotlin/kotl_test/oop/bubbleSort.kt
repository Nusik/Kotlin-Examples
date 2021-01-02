package kotl_test.oop

fun main() {
    val numbers = arrayOf(5,12,-1,0,6,3,10)
    val result = bubbleSort(numbers)
    for (i in result) {
        println(i)
    }
}

//Пузырьковая сортировка

fun bubbleSort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j-1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j-1]
                numbers[j-1] = temp
            }
        }
    }
    return numbers
}

fun bubbleSort(numbers: Array<Int>) = bubbleSort(numbers.toMutableList())
fun bubbleSort(vararg numbers: Int) = bubbleSort(numbers.toMutableList())

package kotlin_test.oop

fun main() {

    val list: MutableList<Int> = ArrayList()
    list.add(5)
    println(list[0])

    val list2: MutableList<Int> = mutableListOf()
    list2.add(5)
    println(list2[0])

    //loops
    val array = arrayOfNulls<Int?>(101)

    //вывести до определенного значения
    for (i in 1..20) {
        println(i)
    }

    //вывести значения по возрастанию до последнего значения массива
    for (i in 0 until array.size) {
        array[i] = i
    }
    for (i in array) {
        println(i)
    }


//вывести значения по убывающей и все четные
    for (j in 100 downTo 0 step 2) {
//      println(j)
    }

    val array1 = arrayOfNulls<Int?>(100)
    for (i in 0..100) {
        array[i] = i
    }
    for ((index, i) in array.withIndex()) {
        array[index] = i?.times(2)             //умножить безопасным способом все элемента массива на 2
    }
    for (i in array) {
        println(i)
    }
}

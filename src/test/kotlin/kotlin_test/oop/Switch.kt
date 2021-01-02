package kotlin_test

fun main() {

    val time = 4
    val whetherIsGood = true
    val state = when {
        time in 6..15 && whetherIsGood -> {
            "go to walk"
        }
        time in 16..23 && !whetherIsGood -> {
            "read book"
        }
        else -> {
            "go to bed"
        }
    }
    //    println(state)

    //вывести все числа от 300 до 600 в порядке убывания, делящиеся на 5 без остатка
    val array = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()) {
        array[index] = i //?.div(5)
    }
    for (i in array.size - 1 downTo 0 step 5) {
        println(array[i])
    }


}
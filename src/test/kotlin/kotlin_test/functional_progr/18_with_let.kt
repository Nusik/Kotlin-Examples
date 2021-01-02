package kotlin_test.functional_progr

var name: String? = "not nullable"

fun main() {
    //let function
    name?.let {
        if (it.length > 5) {
        println(it)
    } }

    //with function - когда нужно произвести множество операций с одним объектом
    val list = mutableListOf<Int>()
    with(list){
    for (i in 0 until 1000){
        add((Math.random()*100).toInt())
    }
    println(sum())
    println(average())
    println(min())
    println(max())
    println(first())
    println(last())
    }
}
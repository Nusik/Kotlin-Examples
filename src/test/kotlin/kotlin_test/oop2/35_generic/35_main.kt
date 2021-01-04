package kotlin_test.oop2.`35_generic`

fun main() {
    val list: MyList<String> = MyArrayList.myListOf("A", "B", "C")
    for (i in 0..100) list.add("$i")
    for (i in 0..90) list.removeAt(0)
    for (i in 0 until list.size()) println(list.get(i))
}
package kotlin_test.functional_progr

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    //в качестве параметра в filter передаем функцию, для этого внутри круглых скобок пишем фигурные.
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        println(i)
    }


//Создать коллекцию имен. Из 1ой коллекции оставить только те имена, которые начинаются на А и добавить их в новую коллекцию
    val names = listOf("Anna", "Irina", "Ksenia", "Arina", "Alex")
    val nameStartsFromA = names.filter { it.startsWith("A") }
    for (name in nameStartsFromA) {
        println(name)
    }

}
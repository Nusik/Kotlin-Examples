package kotlin_test.oop2.dog

fun main() {
    val user = User()
    user.name = null
    user.age = -15
    println("Name: ${user.name}, age: ${user.age}")

    val dog = Dog()
    dog.name = "reks"
    dog.age = -10
    dog.weight = -2
    println("Name: ${dog.name}, age: ${dog.age}, weight: ${dog.weight}")
}
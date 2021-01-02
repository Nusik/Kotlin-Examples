package kotlin_test.oop

fun main() {
printInfo(name ="Ivan")
}

//фнукция, позволяющая вывести только введенные данные пользователя
fun printInfo(lastName: String = "", name: String = "", patronym: String = "") {
    if(lastName.isNotEmpty()) {
        println("Фамилия: $lastName")
    }
    if (name.isNotEmpty()) {
        println("Имя: $name")
    }
    if (patronym.isNotEmpty()) {
        println("отчество: $patronym")
    }
}

package kotlin_test.functional_progr

fun main() {

//Создать два массива: один с телефонами пользователей, другой с именами. Их нужно объединить в один массив
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..100) {
        names.add("Name $i")
        phones.add(38_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val userData = names.zip(phones)
    for (user in userData) {
        println("Name: ${user.first}, Phone number: ${user.second}")
    }

//Создать массив строк и заполнить его Фамилией и именем
    val fullNames = mutableListOf<String>()
    for (i in 0..100) {
        fullNames.add("Name $i Surname $i")
    }
    val userList = fullNames.map {
        Pair(it.substringBefore(" "), it.substringAfter(" "))
    }
    for (users in userList) {
        println("Name: ${users.first}, Surname: ${users.second}")
    }

    //Второй вариант записи:
    val fullName = mutableListOf<String>()
    for (i in 0..100) {
        fullNames.add("Name $i Surname $i")
    }
    val users = fullName.map {
        Pair(it.substringBefore(" "), it.substringAfter(" "))
    }
    for (user in users) {
        println("Name: ${user.first}, Surname: ${user.second}")
    }
}
package kotlin_test.oop2.`29_abctractClass_1`

import sun.misc.Cleaner

fun main() {
    val employees = mutableListOf<Employee>()
    employees.add(Seller("Ivan", 27))
    employees.add(Seller("Anna", 21))
    employees.add(Developer("Andrew", 34, "Kotlin"))
    employees.add(Developer("Victor", 18, "Java"))
    employees.add(Seller("Leonid", 47))
    employees.add(Director("Nick", 50))

    val cleaners = employees.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners) {
        cleaner.clean()
    }
}
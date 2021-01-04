package kotlin_test.oop2.`28_inheritance`

fun main() {
    val dog = Dog(3)
    println(dog.name)

    val employees = mutableListOf<Employee>()
    employees.add(Employee("Ivan", 27))
    employees.add(Employee("Anna", 21))
    employees.add(Developer("Andrew", 34, "Kotlin"))
    employees.add(Developer("Victor", 18, "Java"))
    employees.add(Employee("Leonid", 47))

    for (employee in employees)
        employee.work()

}
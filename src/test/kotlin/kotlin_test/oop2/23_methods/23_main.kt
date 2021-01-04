package kotlin_test.oop2.`23_methods`

fun main() {
    val cat = Cat("Murzik", 2, 2f)
    cat.printInfo()
    println(cat.isOld)
    cat.age = 12
    println(cat.isOld)

    val developer = Worker("Ivan", "Web-developer", 2019)
    developer.printInfo()
}

fun Worker.printInfo() {
    println("Name: $name, position: $position, Start Year: $startYear, Experience: $yearsOfWork")
}
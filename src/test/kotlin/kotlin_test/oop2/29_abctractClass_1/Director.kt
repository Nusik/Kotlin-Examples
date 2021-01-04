package kotlin_test.oop2.`29_abctractClass_1`

class Director(name: String, age: Int) : Employee(name, age) {
    override fun work() {
        println("Manage the process")
    }
}
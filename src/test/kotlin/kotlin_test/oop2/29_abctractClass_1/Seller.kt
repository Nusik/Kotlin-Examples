package kotlin_test.oop2.`29_abctractClass_1`

class Seller(name: String, age: Int) : Employee(name, age), Cleaner {

    override fun work() {
        println("Sell goods")
    }

    override fun clean() {
        println("Seller cleans")
    }
}
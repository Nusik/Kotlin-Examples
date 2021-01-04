package kotlin_test.oop2.`30_abstractClass_2`

class Car(override var name: String = "Car") : Transport(name) {
    override fun drive() {
        println("Car is moving")
    }

    fun startEngine(): Boolean {
        println("Starting engine")
        return true
    }
}
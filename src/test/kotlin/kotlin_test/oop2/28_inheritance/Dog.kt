package kotlin_test.oop2.`28_inheritance`

class Dog (weight: Int) : Animal("Dog", weight, "earth") {

    override fun eat(){
        println("Eat the bone")
    }
}
package kotlin_test.oop2.`28_inheritance`

open class Animal(val name: String, val weight: Int, val habitat: String) {

    open fun eat(){
        println("Eating")
    }

    open fun run(){
        println("Running")
    }

}
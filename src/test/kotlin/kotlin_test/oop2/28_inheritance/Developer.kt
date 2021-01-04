package kotlin_test.oop2.`28_inheritance`

class Developer(name: String, age: Int, val language: String) : Employee(name, age) {

    override fun work(){
        println("Writing code on $language")
    }

}
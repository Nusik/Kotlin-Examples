package kotlin_test.oop2.`29_abctractClass_1`

class Developer(name: String, age: Int, val language: String) : Employee(name, age), Cleaner {

    override fun work(){
        println("Writing code on $language")
    }

    override fun clean() {
        println("Developer cleans")
    }
}
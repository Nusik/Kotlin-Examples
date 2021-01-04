package kotlin_test.oop2.`34_Singleton`

fun main(){
val db = Database
    db.insertData("10")
    db.insertData("20")

    val test = Test()
    test.insertTestData("30")
    test.insertTestData("40")

    for (str in db.data){
        println(str)
    }
}
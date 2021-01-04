package kotlin_test.oop2.`34_Singleton`

object Database {
    const val name = "main.db"
    const val version = 1
    val data = mutableListOf<String>()

    fun insertData(str: String) {
        data.add(str)
    }
}
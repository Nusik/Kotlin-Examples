package kotlin_test.oop2.`23_methods`

import java.time.LocalDate
import java.util.*

class Worker (val name: String, var position: String, val startYear: Int) {

    val yearsOfWork: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work(){
        println("Working")
    }

}
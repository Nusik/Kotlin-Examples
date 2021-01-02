package kotlin_test.oop

import java.lang.Exception

fun main(){
    sum("10", "string")
}

fun sum(a: String, b: String) : Int {
    val result = try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e: Exception){
        0
    }
    println(result)
return result
}
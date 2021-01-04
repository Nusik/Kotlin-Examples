package kotlin_test.oop2.`25_dataClass_enum`
import kotlin_test.oop2.`25_dataClass_enum`.Month.*

fun main() {
    val student1 = Student("Ivan", "Ivanov", "133")
    val student2 = student1.copy(id="1235")
    println(student2)
    println(student1)
    println(student1.hashCode())
    println(student2.hashCode())

    println(student1 == student2)  //сравнивание двух объектов
    println(student1 === student2) //сравниваем, ссылаются ли оба объекта на один и тот же объект

    //деструктор - получение из объекта набора переменных
    val (name,lastName, id) = student1
    println(name)
    println(lastName)
    println(id)

    val month = APRIL
    val season = when(month){
        DECEMBER, JANUARY, FEBRUARY -> "Winter"
        MARCH, APRIL, MAY -> "Spring"
        JUNE, JULY, AUGUST -> "Summer"
        SEPTEMBER,OCTOBER , NOVEMBER -> "Autumn"
    }
    println(month.temperature)
    println(season)



}
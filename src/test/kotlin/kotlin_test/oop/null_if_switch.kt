package kotlin_test.oop

fun main() {

// NULLABLE VARIABLES
    val name1: String? = "1234"
    val name2: String? = null
    val name3: String? = "Ivanov"
    val result: Int? = (name1?.length ?: 0)!! + (name2?.length ?: 0)!! + (name3?.length ?: 0)!!  //если в переменной будет null, то по дефолту возьмется в расчет 0
    println(result)

    // IF operator

    //в зависимости от суммы денег вывести название еды, которую может позволить себе пользователь
    var countMoney = 600
    val food = if (countMoney > 500) {
        countMoney -= 500
        "Luxury food"
    } else if (countMoney > 300) {
        countMoney -= 300
        "Fish"
    } else {
        countMoney -= 10
        "null"
    }
    println("You can buy $food and will left $countMoney")

//switch in kotlin

    //вывести название времени года в зависимости от номера месяца
    val indexOfMonth = 2
    val season = when (indexOfMonth) {
        12, 1, 2 -> {
            "Winter"
        }
        in 3..5 -> {
            "Spring"
        }
        in 6..8 -> {
            "Summer"
        }
        in 9..11 -> {
            "Autumn"
        }
        else -> {
            "Month with this number doesn't exist"
        }
    }
    println(season)

//вывести название времени года в зависимости от названия введенного месяца
    val monthName = "new"
    val season2 = when (monthName) {
        "december", "january", "february" -> {
            "Winter"
        }
        "March", "April", "May" -> {
            "Spring"
        }
        "June", "July", "August" -> {
            "Summer"
        }
        "September", "October", "November" -> {
            "Autumn"
        }
        else -> {
            "Month with entered name doesn't exist"
        }
    }
    println(season2)


    //в зависимости от температуры вывести состояние жидкости
    val temp = 85
    val state = when {
        temp < 0 || temp < 80 -> "твердое"
        temp < 100 -> "liquid"
        else -> "gas"
    }
    println(state)
}

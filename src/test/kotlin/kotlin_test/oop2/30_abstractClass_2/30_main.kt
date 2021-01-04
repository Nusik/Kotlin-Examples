package kotlin_test.oop2.`30_abstractClass_2`

fun main() {
    //Task 1
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()
    if (car is Car) {
        car.name = "Car2"
    }
    println(car.name)

    //анонимный класс
    travel(object : Transport("Train") {
        override fun drive() {
            println("Train is moving")
        }
    })

    //Task 2 - 1st variant
    val sportsman1 = Sportsman()
    sportsman1.invokeWaterBoy(object : WaterBoy {
        override fun bringWater() {
            println("Water is delivered")
        }
    })

    //Task 2 - 2nd variant
    val sportsman2 = Sportsman()
    sportsman2.invokeWaterBoy { println("Water is delivered") }


}

fun travel(transport: Transport){
    transport.drive()
}
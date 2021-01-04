package kotlin_test.oop2.`30_abstractClass_2`

class Sportsman {

    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }

    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}
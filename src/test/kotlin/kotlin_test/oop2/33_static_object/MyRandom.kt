package kotlin_test.oop2.`33_static_object`

class MyRandom {
    companion object {
        private const val MONDAY = "MONDAY"
        private const val TUESDAY = "TUESDAY"
        private const val WEDNESDAY = "WEDNESDAY"
        private const val THURSDAY = "THURSDAY"
        private const val FRIDAY = "FRIDAY"
        private const val SATURDAY = "SATURDAY"
        private const val SUNDAY = "SUNDAY"

        //генерируем рандомное число в заданном промежутке
        fun randomInt(from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt() + from

        fun randomBoolean() = randomInt(0, 1) > 0 //если число > 1, то будет true; если меньше - false

        fun randomDayOfWeek(): String {
            val index = randomInt(1, 7)
            return when (index) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                7 -> SUNDAY
                else -> "no"
            }
        }
    }
}
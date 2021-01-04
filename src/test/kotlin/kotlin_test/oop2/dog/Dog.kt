package kotlin_test.oop2.dog

class Dog {
    var name = ""
        get() = field.toLowerCase().capitalize()

    var age = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }

    var weight = 0
        set(value) {
            if (value >= 0) {
                field = value
            }
        }
}
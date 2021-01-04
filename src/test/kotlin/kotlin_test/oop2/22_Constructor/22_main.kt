package kotlin_test.oop2.`22_Constructor`

fun main() {
    val ukraine = Country("Ukraine")
    println(ukraine.name)
    ukraine.population = 50_000_000

    val book = Book("Fairytails", 1990, 500.99)
    println(book.name)
    book.year = 1980
}
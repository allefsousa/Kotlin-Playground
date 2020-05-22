import model.Person

fun main() {

    forIndex()
    sequences()
    integerList()
    stringKotlin()


}

private fun forIndex() {
    val listLetters = listOf("A", "b", "c", "d")
    for ((index, value) in listLetters.withIndex()) {
        println("Index = $index  Valor = $value")
    }
}

private fun sequences() {
    val listPerson = listOf(
        Person("Allef", 19), Person("Paulo", 32), Person("Rose", 23)
        , Person("tiago", 65)
    )

    println(
        "${
        listPerson
            .asSequence()
            .filter { it.idade in 11..25 }
            .maxBy { it.idade }
            ?.name
        }"

    )
}

private fun stringKotlin() {
    val name = "##Allef sousa santos++"
    println(name.take(4))
    println(name.takeLast(4))
    println(name.takeWhile { !it.isLetter() })
    println(name.takeLastWhile { !it.isLetter() })
}

private fun integerList() {
    val listIds = mutableListOf(2, 5, 7, 10, 4, 3, 15, 25, 30)
    println(listIds.takeWhile { it < 10 })
    println(listIds.dropWhile { it < 10 })
    println(listIds.takeLastWhile { it % 2 == 1 })
    println(listIds.dropLastWhile { it % 2 == 1 })
}
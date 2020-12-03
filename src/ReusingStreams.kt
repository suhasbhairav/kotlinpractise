fun main() {
    val listDetails = listOf(1,2,3,4,5).filter { it%2 == 1 }.asReversed()

    println(listDetails)

    val listDetails2 = listOf<String>("India", "Germany", "Singapore", "Switzerland").filter { it.startsWith("S") }.asIterable()

    listDetails2.forEach { println(it.toUpperCase()) }

    listDetails.forEach(::println)

    listDetails.map { 2*it + 1 }.average().apply(::println)

    listDetails.map { 2*it }.apply(::println)

    val test = listDetails.map { 2*it }

    println(listDetails.filter { it%2==1 }.count())

    println(test)
    println(listDetails)


    data class Person(val name: String, val age: Int)

    val listPersons = listOf(Person("A", 10), Person("B", 20), Person("C", 30))

    println(listPersons.filter { it.age  <= 10 }.count())
}
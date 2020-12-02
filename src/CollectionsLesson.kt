fun main() {
    val list1 = listOf<Int>(1,2,3,4)
    val set1 = setOf<Int>(1,2,3,4)
    val map1 = mapOf<Int, String>(Pair(1, "Car"), Pair(2, "Kotlin"), Pair(3, "Bike"))
    val map2 = mapOf<Int, String>(Pair(10, "Bike"), Pair(20, "Car"), Pair(30, "Bat"))

    println(list1)
    println(set1)
    println(map1)
    println(map2)

}
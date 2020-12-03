fun main() {
    val list1 = listOf<Int>(10,20,5,34,2,100)
    for((index, element) in list1.withIndex()){
        println("$index ... $element")
    }

    val list2 = listOf<Int>(20,30,47,69,14,265)
    for((index, element) in list2.withIndex()){
        println("$index ... $element")
    }
}
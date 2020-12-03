fun justPrint(x: Int) =  x> 0

fun justAnother(x: Int) = (x%2 ==0)

fun main() {

    val list1 = listOf(1,-2,3,5,4)

    println(list1.filter(::justPrint))

    val list2 = listOf(1,2,3,4,5,6,7,8,9,10)

    println(list2.filter(::justAnother))
}
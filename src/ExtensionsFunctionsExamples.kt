
fun IntArray.addTo(dest: IntArray){
    for (i in 0 .. size-1){
        dest[i] += this[i]
    }

    dest.forEach { it ->
        println(it)
    }
}

fun IntArray.subTo(dest: IntArray){
    for(i in 0 .. size-1){
        dest[i] -= this[i]
    }

    dest.forEach { it->
        println(it)
    }
}

fun add(x: Int) =  x+2
fun sub(y: Int) =  y-2

fun main() {
    val myArray = intArrayOf(1,2,3)
    intArrayOf(4,5,6).addTo(myArray)
    intArrayOf(10,20,30).subTo(myArray)

    val list1 = listOf<Int>(1,2,3,4).map(::add)
    val list2 = listOf<Int>(50,60,70,80).map(::sub)

    println(list1)
    println(list2)

}
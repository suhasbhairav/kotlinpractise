
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

fun main() {
    val myArray = intArrayOf(1,2,3)
    intArrayOf(4,5,6).addTo(myArray)
    intArrayOf(10,20,30).subTo(myArray)
}
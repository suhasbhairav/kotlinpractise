
class Example<T>{
    fun justPrint(a: List<T>, b: List<T>){
        a.forEach { it->
            println(it)
        }
        b.forEach { it->
            println(it)
        }
    }

}

class GenericsExamplesSample<T>{
    fun justPrint(a: T){
        println(a)
    }
}


interface Source<out T>{
    fun nexT(): T
}

fun demo(strs: Source<String>){
    val objects: Source<String>
}

interface Comparable<in T>{
    operator fun compareTo(other: T): Int
}

fun demo2(x: Comparable<Number>){
    x.compareTo(1.0)
    val y: Comparable<Double> = x
    
}

fun main() {
    val eg = Example<Int>()
    eg.justPrint(listOf(1,2,3), listOf(4,5,6))

    val eg2 = GenericsExamplesSample<String>()
    eg2.justPrint("Test 123")


}
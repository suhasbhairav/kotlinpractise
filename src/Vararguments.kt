fun justPrint(vararg numbers:Int){
    numbers.forEach { println(it) }
}

fun justAnother(vararg numbers: Double){
    numbers.forEach { println(it) }
}

fun main() {
    justPrint(1,2,3)
    justPrint(2,1)
    justPrint(1)

    justAnother(1.0,2.0,3.0)
    justAnother(2.0,3.5)
}
fun main() {


    val foo: Int by lazy { 1+2 }
    println(foo)

    val foo2: Int by lazy { 2+2 }

    println("$foo2")

    val foo3: Double by lazy { 2.1 + 3.5}
    println("$foo3")


}


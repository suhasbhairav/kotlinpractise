fun main() {
    test()
    test1()

    println(doubleMethod(2,3))
    println(justMultiply(2,3,4))

    //String interpolation
    val num = 10
    val s = "i = $num"

    println(s)

    val num2 = 20
    val s1 = "j  $num2"

    println(s1)

    var a: String? = null
    var b: String? = "test"
    var c: String? = null

    var i = 10
    var j = 20

    var ans = a.equals(b) ?: (a === null)
    println(ans)

}

fun test(): Unit{
    println("Test Method...")
}

fun test1(): Unit{
    println("Test Method...")
}

fun doubleMethod(x: Int, y: Int): Int = x*y

fun justMultiply(x: Int, y: Int, z: Int): Int = x * y * z
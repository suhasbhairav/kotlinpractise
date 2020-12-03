interface A{
    fun printA()
    fun foo(){
        println("Test A...")
    }
}

interface B{
    fun printB()
    fun foo(){
        println("Test B...")
    }
}

class C: A,B{
    override fun printA() {
        println("printA")
    }

    override fun printB() {
        println("Print B")
    }

    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

}

fun main() {
    val obj = C()
    obj.printA()
    obj.printB()
    obj.foo()
}
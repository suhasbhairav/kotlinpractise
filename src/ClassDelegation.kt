import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor

interface Foo{
    fun example()
}

interface FooNext{
    fun eg1()
    fun eg2()

}

class Test: Foo{
    override fun example() {
        println("Test example")
    }
}

class Test2: Foo, FooNext{
    override fun example() {
        println("Test eg...")
    }

    override fun eg1() {
        println("Test eg1...")
    }

    override fun eg2() {
        println("Test eg2...")
    }

}


fun main() {
    var test = Test()
    test.example()

    var test2 = Test2()
    test2.eg1()
    test2.eg2()
    test2.example()
}
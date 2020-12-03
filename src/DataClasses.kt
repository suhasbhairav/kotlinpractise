data class TestUser(var fname: String, var lname: String,var age: Int)

data class TestAClass(val className: String, val classType: String)

fun main() {
    val obj = TestUser("test", "number", 10)
    println(obj.age)
    println(obj.fname)
    println(obj.lname)

    val obj2 = TestAClass("Test Class", "String")
    println(obj2.className)
    println(obj2.classType)

    val obj3 = obj2.copy()
    println(obj3.classType)
    println(obj3.className)

    val obj4 = obj2.copy(className = "Test2")
    println(obj4.className)
    println(obj4.classType)


}
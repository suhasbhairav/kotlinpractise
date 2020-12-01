fun main() {

    val user = User("foo", "bar")
    println(user.userName{ firstName, lastName -> "${firstName.toUpperCase()}_${lastName.toUpperCase()}" })

    val addition = { a: Int,b: Int -> a+b }
    println(addition(20,3))

    val subtraction = { a:Int, b:Int -> a-b}
    println(subtraction(200,106))

    val multiplication = {a:Int, b: Int -> a*b}
    println(multiplication(2,3))

    val concatenate = {a: String, b: String -> a+b }
    println(concatenate("fii","koo"))

    val justconcat = {a: String, b: String -> a.toUpperCase().plus(b.toUpperCase())}
    println(justconcat("ijjj", "oppp"))

    var lstVal = listOf(1.2,2.2,3.3)
    var lstVal2 = lstVal.map { it*2 }
    println(lstVal2)

    var lstVal3 = listOf<Int>(2,4,6)
    var lstVal4 = lstVal3.map { it*4 }
    println(lstVal4)

    var lst5 = listOf<Int>(3,6,9)
    var lst6 = lst5.map { it*3.5 }
    println(lst6)

    var lst7 = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    var even = lst7.filter { it%2 == 0 }
    println(even)

    var odd = lst7.filter { it%2 !=0 }
    println(odd)

}

data class User(val firstName: String, val lastName: String){
    fun userName(usernameGenerator: (String, String) -> String) = usernameGenerator(firstName, lastName)
}




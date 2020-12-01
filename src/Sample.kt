fun main(args: Array<String>){
    println("Enter two numbers")
    var (a,b) = readLine()!!.split(" ")

    println("Maximum number is: ${maxNum(a.toInt(),b.toInt())}")
    println("Minimum number is: ${minNum(a.toInt(), b.toInt())}")
    var (c,d) = readLine()!!.split(" ")
    println("Difference is: ${subNum(c.toInt(), d.toInt())}")


}

fun maxNum(a: Int, b: Int): Int{
    var max = if(a>b){
        println("$a is greater")
        a
    }else{
        println("$b is greater")
        b
    }

    return max
}

fun subNum(c: Int, d:Int): Int{
    var sub: Int = 0
    if(c>d){
        println("$c is greater")
        sub = c-d
    }else{
        println("$d is greater")
        sub = d-c
    }
    return sub
}

fun minNum(a: Int, b:Int): Int{
    var min = if(a<b){
        println("$a is smaller")
        a
    }else{
        println("$b is smaller")
        b
    }
    return min





}
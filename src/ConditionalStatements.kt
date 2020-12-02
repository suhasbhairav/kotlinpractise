enum class Day{
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}

enum class Numbers{
    One,
    Two,
    Three
}

enum class StringNumbers{
    Four,
    Five,
    Six,
    Seven
}

fun main(args: Array<String>) {

    val num = Numbers.One
    when(num){
        Numbers.One -> println("Number 1")
        Numbers.Two -> println("Number 2")
    }
    val stringNumber = StringNumbers.Five
    when(stringNumber){
        StringNumbers.Five -> println("Good")
        StringNumbers.Four -> println("Best")
        StringNumbers.Six -> println("Better")
    }

    val day: Day = Day.Friday
    when(day){
        Day.Sunday -> println("Sunday")
        Day.Monday -> println("Monday")
        Day.Tuesday -> println("Tuesday")
        Day.Wednesday -> println("Wednesday")
        Day.Thursday -> println("Thursday")
        Day.Friday -> println("Friday")
        Day.Saturday -> println("Saturday")
    }

    //when
    val x  = "test"
    when(x){
        "test" -> println("Wow test")
        "test1" -> println("Wow test1")
        else -> println("Just else...")
    }

    val y = 100
    when(y){
        100 -> println("100...")
        200, 300 -> println("200 300...")
        400, 500, 600 -> println("400 500 600...")
        else -> println(" Else part...")
    }

    val z = 10
    if(z === 1){
        println("Test...")
    }else if(z===2){
        println("z....")
    }else if(z===3){
        println("z1...")
    }else{
        println("else...")
    }

    val abc = 1000
    if(abc < 100){
        println("test...")
    }else if(abc > 100 && abc < 500){
        println("yes...")
    }else{
        println("nope...")
    }

    var max = if(abc > 2000) 200 else 300

    println(max)

    var min = if(abc%5 === 0) 2000 else 5000

    println(min)

    var sub = if(abc % 3 === 0) 30000 else 50000

    println(sub)

    when{
        abc%5 == 0 -> println("Just mod...")
        abc%3 == 1 -> println("Just mod1...")
        abc % 4 == 1 -> println("Just mod2...")
        else -> println("Else...")
    }

    val res = 25

    when{
        res % 2 == 0 -> println("Just print...")
        res % 3 == 0 -> println("Just print2132")
        else -> println("Nothing...")
    }

    val names = listOf<String>("India", "Germany", "Singapore")
    val io = "Germany1"
    when (io){
        in names -> println("I know the name")
        !in names -> println("Not there")
    }

    val ioname = "Hungary"
    when(ioname){
        in names -> println("In names")
        !in names -> println("yes!!")
    }




}
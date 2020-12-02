fun main() {
    try{
        val a = 100
        val b = 0
        val ans = a/b
    }catch (e: Exception){
        println("${e.localizedMessage}")
    }finally{
        println("Just print ...")
    }
}
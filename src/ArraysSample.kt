import com.sun.org.apache.xpath.internal.operations.Bool
import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

fun main() {
    var strings = Array<String>(size = 5, init = {index -> "Item #$index"})

    println(Arrays.toString(strings))

    var strings1 = Array<String>(size=3, init={index -> "Item $index"})
    println(Arrays.toString(strings1))

    println(strings1.get(2))

    strings1.set(index = 2, value="Test")

    println(Arrays.toString(strings1))

    var arrInteger: IntArray = intArrayOf(1,2,3,4)

    var arrChar: CharArray = charArrayOf('a','b','c','a')

    var arrBool: BooleanArray = booleanArrayOf(true, true, true)

    var arrDouble: DoubleArray = doubleArrayOf(2.0,3.0)

    var arrFloat: FloatArray = floatArrayOf(21.2f,22.3f)

    var arrLong: LongArray = longArrayOf(723648, 7872346827)

    var arrShort: ShortArray = shortArrayOf(1,2,3)

    println(arrShort.average())

    println(arrInteger.average())

    println(arrDouble.average())

    println(arrChar.toHashSet())

    arrLong = arrLong.sortedArray()
    println(arrLong.size)


    var asc = Array(size=5, init = { i -> (i*i).toString() })
    for (s:String in asc){
        println(s)
    }

    for(i:Int in arrInteger){
        println(i)
    }

    for(d:Double in arrDouble){
        println(d)
    }

    for(e:Char in arrChar){
        println(e)
    }

    for(b in arrBool){
        println(b)
    }

    var justArray = arrayOf("1",2,"3")
    for(x in justArray){
        println(x)
    }

    //Array using closure
    var arrClosure = Array(3) { i -> i*3 }

    //Array using closure
    var arr2Closure = Array(5) {i -> i*5 }

    for(x in arrClosure){
        println(x)
    }

    for(x in arr2Closure){
        println(x)
    }
}
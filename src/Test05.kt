fun main() {
    var str1:String? = "Hello Kotlin"
    str1=null
    println("str1 = $str1")

    val str2:String? = "Kotlin"
    println(str2)

    println("str2=$str2, length=${str2?.length}")
    println("str2=$str2, length=${str2?.length?:0}")
    println("str2=$str2, length=${str2!!.length}")

}
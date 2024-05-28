fun main() {
    var a:Any = 1
    println("a : $a type is ${a.javaClass}")

    a=300L
    println("a : $a type is ${a.javaClass}")

    checkType("Today")
    checkType(1234)
    checkType(1234567891234)
    checkType(1234F)
}

fun checkType(x:Any) {
    if(x is String)
        println("x is String : $x")
    else if(x is Int){
        println("x is String : $x")
    }
    else
        println("x is type : ${x.javaClass}")
}

fun sayHello2(name:String = "Korea"){
    println("Hello!! $name")
}

fun sayHello3(no:Int, name:String = "korea"){
    println("Hello!! $name")
}

fun main() {
    sayHello2()
    sayHello2("Kim")
    sayHello3(5)
    sayHello3(no=10)
    sayHello3(no=10, name="Kim")
}
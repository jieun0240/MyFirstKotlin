fun satHello(name:String) = println("Hello! $name")

fun sayHello1(name:String?){
    if(name==null)
        println("Hello!! Korea")
    else
        println("Hello!! $name")
}


fun main() {
    sayHello1(null)
    sayHello1("kim")
}
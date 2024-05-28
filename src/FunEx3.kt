fun some(a:String){
    println("some($a:String) call....")
}
fun some(a:Int){
    println("some($a:Int) call....")
}
fun some(a:Int, b:String){
    println("some($a:Int, $b:String) call....")
}

fun main() {
    some("Hello")
    some(10)
    some(100, "Kotlin")
}
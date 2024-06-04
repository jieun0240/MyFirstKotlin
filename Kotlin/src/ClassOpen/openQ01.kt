package ClassOpen

open class Shape(var name:String="도형"){
    open fun rotate() = println("${name}을 회전합니다.")
}
class Rect(name:String, var width:Int=1, var hight:Int=1) : Shape(name){
    override fun rotate() {
        super.rotate()
        println("가로:${width}, 세로:${hight}, 회전")
    }
}

fun main() {
    var a = Rect("삼각형", 10, 20)
    a.rotate()
}
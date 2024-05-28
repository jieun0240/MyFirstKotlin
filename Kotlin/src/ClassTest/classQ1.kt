class Circle(var name:String="피자", val radius:Int=1) {
    var pi:Double=3.14
    fun show()=println("{$name}의 반지름은 ${radius}")
    fun area()=println("${name}의 넓이는 ${pi*radius*radius}")
    fun around()= println("${name}의 둘레는 ${(pi*radius*2).toInt()}")
}

fun main() {
    val c1:Circle=Circle("도넛", 10)
    c1.show()
    c1.area()
    c1.around()

    val c2:Circle=Circle(radius = 10)
    c2.show()
    c2.area()
    c2.around()

}
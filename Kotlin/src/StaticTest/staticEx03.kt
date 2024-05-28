package StaticTest

class Bird4 (var name:String="noName", var wing:Int=2, var color:String="white"){ // constructor 생략
    companion object{ //자바의 static 대신 사용
        var num:Int=0
    }
    init {
        println("** Bird4 만들기 **")
        num++
    }
    lateinit var food:String //프로퍼티 속성 정의
    constructor(name:String, wing:Int, color:String, food:String) : this(name, wing, color){ //부생성자
        this.food=food
    }
    fun print()= println("$name, $wing, $color")
    fun fly()= println("Flying wing")
    fun sing(vol:Int)= println("Singing vol:$vol")
    fun food()= println("food = $food")
}
fun main() {
    val coco1:Bird4=Bird4()
    val coco2:Bird4=Bird4()
    val coco3:Bird4=Bird4()
    println("새의 수 : ${Bird4.num}")
}
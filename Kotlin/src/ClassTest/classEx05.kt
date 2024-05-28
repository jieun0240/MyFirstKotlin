package ClassTest

class Bird3 (var name:String="noName", var wing:Int=2, var color:String="white"){ //주생성자
    init {
        println("** Bird3 만들기 **")
    }
    lateinit var food:String
    constructor(name:String, wing:Int, color:String, food:String) : this(name, wing, color){ //부 생성자
        this.food=food
    }
    fun print()= println("$name, $wing, $color")
    fun fly()= println("Flying wing")
    fun sing(vol:Int)= println("Singing vol:$vol")
    fun food()= println("food = $food")
}
fun main() {
    val coco:Bird3 = Bird3("coco3", 2, "blue", "feed")
    coco.print()
    coco.food()
    coco.sing(4)
}
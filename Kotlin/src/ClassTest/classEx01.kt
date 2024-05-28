class Birds {
    var mane : String="myBird"
    var wing : Int = 2
    var color = "blue"

    fun fly() = println("Flying wing")
    fun sing(vol:Int) = println("Singing vol : $vol")
}

fun main() {
   val coco : Birds = Birds()
   coco.color="red"
   println("coco.color : ${coco.color}")

   coco.fly()
   coco.sing(2)
}
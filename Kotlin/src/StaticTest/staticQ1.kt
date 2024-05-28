package StaticTest

class Card (var kind:String="Spade", var num:Int=1){
    companion object{
        var whdth:Int=100
        var height:Int=250

        fun showSize()= println("카드의 폭 : $whdth, 높이 : $height")
    }
    fun show(name:String) = println("${name}>> 무늬 : $kind 값 : $num")
}

fun main() {
    Card.showSize()

    val c1:Card=Card("Heart", 7)
    val c2:Card=Card()
    c1.show("c1")
    c2.show("c2")

    Card.whdth=50
    Card.height=80
    Card.showSize()
}
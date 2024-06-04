package ClassOpen

import org.intellij.lang.annotations.Language

open class Bird2(var name:String="Noaname", var wing:Int=2, var color:String="white"){
    fun print()= println("$name, $wing, $color")
    fun fly()= println("Flying wing")
    open fun sing(vol:Int)= println("Singing vol:$vol")
}
class Lark2(name:String, wing:Int, color:String) : Bird2(name, wing, color){
    fun singHighTone()=println("Happy Song")
}
class Parrot2:Bird2 {
    val language:String
    constructor(name:String, wing:Int, color:String, language:String):super(name, wing, color){
        this.language=language
    }
    fun speak()=println("Speak $language")

    override fun sing(vol:Int){
        super.sing(vol)
        println("Im a parrot, the volume level is $vol")
        speak()
    }
}

fun main() {
    val lark=Lark2("종달새", 2, "회색")
    val parrot=Parrot2("앵무새", 2, "빨강", "한국어")
    lark.print(); lark.fly(); lark.sing(2); lark.singHighTone();
    println()
    parrot.print(); parrot.fly(); parrot.sing(4)
}
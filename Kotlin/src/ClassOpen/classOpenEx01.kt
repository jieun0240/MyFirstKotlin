package ClassOpen

import org.intellij.lang.annotations.Language

open class Brid(var name:String="Noname", var wing:Int=2, var color:String="white"){
    fun print()=println("$name, $wing, $color")
    fun fly()= println("Flying wing")
    fun sing(vol:Int)= println("Singing vol:$vol")
}
//종달새
class Lark(name:String, wing: Int, color: String):Brid(name, wing, color){
    fun singHighTone()= println("Happy Song")
}
//앵무새
class Parrot:Brid{
    val language:String
    constructor(name:String, wing: Int, color: String, language: String):super(name, wing, color){
        this.language=language
    }
    fun speak()= println("Speak $language")
}

fun main(){
    val coco=Brid(name = "coco", color = "black")
    val lark=Lark("myLark", 2, "brown")
    val parrot=Parrot("myLark", 2,"red", "korean")
    coco.print()
    lark.print()
    parrot.print()
    parrot.speak()
}
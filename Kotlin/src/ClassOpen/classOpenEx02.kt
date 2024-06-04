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

fun main(){
    var birdArr:ArrayList<Bird2> = ArrayList()
    birdArr.add(Lark2("종달새", 2, "회색")) //업캐스팅
    birdArr.add(Parrot2("앵무새", 2, "빨강", "한국어"))
    for(i in birdArr){
        i.print(); i.fly(); i.sing(2)
        if(i is Lark2) i.singHighTone() //다운 캐스팅
        println()
    }
    var b = birdArr.get(0) as Lark2 //다운 캐스팅
    b.singHighTone()
}
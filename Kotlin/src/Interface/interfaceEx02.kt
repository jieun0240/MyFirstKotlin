open class People{
    open fun needTosleep(){ }
}
open abstract class Student1 : People(){
    abstract fun learnKotlin()
    fun learnJava(){ }
}
interface Study1{
    fun coding(program:String) //추상메소드
    fun study()=println("studying") // 함수
}
interface Work{
    fun working() //추상메소드
}
class Worker: Student1(), Study1, Work {
    override fun coding(program: String) = println("$program : study")
    override fun learnKotlin() = println("easy kotlin")
    override fun working() = println("working")
}

fun main() {
    var w = Worker()
    w.study()
    w.coding("kotlin")
    w.learnKotlin()
    w.working()
}
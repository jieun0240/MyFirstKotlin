package Interface

open abstract class Calc{
    var a: Int =0
    var b: Int =0
    abstract fun cal(): Int
    abstract fun input()
    fun run(){
        input()
        println("계산된 값은 ${cal()}")
    }
}

class Adder:Calc() {
    override fun input() {
        print("덧셈 연산을 위한 정수 2개를 입력>>")
        var (x, y) = readln().split(" ").map { it.toInt() }
        a=x; b=y
    }
    override fun cal():Int = (a+b)
}

class Sub:Calc() {
    override fun input() {
        print("뺄셈 연산을 위한 정수 2개를 입력>>")
        var (x, y) = readln().split(" ").map { it.toInt() }
        a=x; b=y
    }
    override fun cal():Int = (a-b)
}

fun main() {
    var add: Adder = Adder()
    var sub: Sub = Sub()
    add.run(); sub.run()
}
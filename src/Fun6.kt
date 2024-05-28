fun opp(a:Int, b:Int, op:String):Int {
    var sum = 0
    when(op){
        "+" -> return a+b
        "-" -> return a-b
        "*" -> return a*b
        "/" -> return a/b
    }
    return 0
}

fun main() {
    print("숫자1 입력 >> ")
    var a = readln().toInt()

    print("숫자2 입력 >> ")
    var b = readln().toInt()

    print("연산자 입력 >> ")
    var oppp = readln().toString()

    println(opp(a, b, oppp))
}
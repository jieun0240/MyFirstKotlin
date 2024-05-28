fun sumBasic(a:Int, b:Int):Int {
    return a+b
}
fun sum(a:Int, b:Int) = a+b //단일표기식

fun main() {
    print("정수1 입력 >> "); val x = readln().toInt()

    print("정수2 입력 >> "); val y = readln().toInt()

    println("$x + $y = ${sum(x, y)}")

    var result = sum(1,2)
    println("1 + 2 + $result")
}
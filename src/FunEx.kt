fun max(a:Int, b:Int):Int {
    if(a > b)
        return  a
    else
        return  b
}

fun main() {
    print("정수1 입력 >> "); val a = readln().toInt()

    print("정수2 입력 >> "); val b = readln().toInt()

    print("$a 와 $b 중 큰 수 = ${max(a, b)}")
}
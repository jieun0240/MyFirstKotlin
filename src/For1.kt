fun main() {
    print("정수를 입력 >> ")
    var num = readln().toInt()
    var sum = 0
    for(i in 0..num step 2){    // 짝수만 나오는 for문
        sum += i
    }
    println("짝수의 합 = $sum")
}
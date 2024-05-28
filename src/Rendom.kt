import java.util.Random

fun main() {
    val rendom = Random()
    val num = rendom.nextInt(10)+1  //1~10 랜덤

    var count = 0

    while (true) {
        print("컴퓨터가 생각한 수를 맞춰 보세요(1~10) >> ")
        var r = readln().toInt()
        if(num > r){
            println("입력한 수가 컴값 보다 작습니다."); count++
        }
        else if(num < r){
            println("입력한 수가 컴값 보다 큽니다. "); count++
        }
        else {
            println("정답!"); break
        }
    }
    println("${count}번 만에 맞췄습니다.")

}
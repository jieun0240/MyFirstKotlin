import java.util.Random

fun main() {
    println("**로또 번호 생성을 시작합니다**")

    val redom = Random()

    print("몇 번을 뽑을까요? ")
    val num = readln().toInt()

    for(i in 1..num) {
        print("자동번호 --> ")
        for(i in 1..6) {
            val lotto = redom.nextInt(45)+1
            print("$lotto ")
        }
        println()
    }
}
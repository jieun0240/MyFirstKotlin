fun main() {
    print("점수 입력 >> ")
    var Score = readln().toFloat()
    var Grade = 'F'
    when(Score){
        in 90.0..100.0 -> Grade = 'A'
        in 80.0..89.9 -> Grade = 'B'
        in 70.0..79.9 -> Grade = 'C'
        !in 70.0..100.0-> Grade = 'D'
    }
    println("Score: $Score, Grade: $Grade")
}
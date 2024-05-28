fun main() {
    print("성적을 입력하시오 : ")
    var score: Int
    var res: String

    score = readln().toInt()
    res = if (score in 90..100)
        "A"
    else if(score in 70..89)
        "B"
    else if(score in 50..69)
        "C"
    else
        "F"

    println("당신의 성적 등급은 $res 입니다.")

    //나지은

}
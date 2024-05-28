fun main(){
    print("숫자1 입력 >> ")
    var num1: Int = readln().toInt()
    print("숫자2 입력 >> ")
    var num2: Int = readln().toInt()    // Int이기 때문에 숫자가 아님 예외발생

    var max = if(num1 > num2)
        num1
    else if(num1 < num2)
        num2
    else
        num1

    println("max=$max")
    println("=====================================================")

    print("나이를 입력하시오 >> ")
    var age: Int
    var ageRange: String
    try {
        age = readln().toInt()
        ageRange = if (age in 10..18)
            "청소년"
        else if(age in 19..29)
            "청년"
        else if(age in 30..49)
            "중년"
        else if (age in 50..64)
            "장년"
        else if(age >= 65)
            "노년"
        else
            "잘못 입력"

        println("$age 세는 $ageRange 입니다")
    }
    catch (e : Exception) { println("null") }
    println("=====================================================")

    
}

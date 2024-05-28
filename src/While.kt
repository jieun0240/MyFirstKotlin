fun main() {
    while(true) {
        print("데이터 타입 선택[1)Int, 2)String, 3)종료 } >> ")
        var dType = readln().toInt()
        if(dType==3) { println("종료합니다."); break }
        var n:Any
        if(dType==1){ print("Int 데이터 입력(1~100)>> "); n = readln().toInt() }
        else if(dType==2){ print("String 데이터 입력(cat,dog)>> "); n = readln() }
        else n="other"
        when(n){
            in 1..100 -> println("Int")
            "dog", "cat" -> println("String")
            !is String -> println("String 아님")
            else -> println("입력 오류!! 다시 선택하세요.")
        }
    }
}
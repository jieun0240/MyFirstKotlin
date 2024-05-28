fun main(){

    println("==커피 주문하세요==")
    println("에프 2000원    아메 2500원    카푸 3000원")

    print("커피 선택 >> ")
    var menu = readln().toString()

    print("잔 수 >> ")
    var n = readln().toInt()

    when(menu){
        "에프"-> println("${2000*n}원 입니다.")
        "아메"->println("${2500*n}원 입니다.")
        "카푸"->println("${3000*n}원 입니다.")
        else->println("잘못입력하셧습니다..ㅠㅠ")
    }
}
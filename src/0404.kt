fun main() {

//    print("온도입력 >> ")
//    var c = readln().toDouble()
//
//    print("단위입력(F/C) >> ")
//    var fc = readln().toString()
//
//    var res: Double
//
//    if(fc in "F" || fc in "f") {
//        res = ((c - 32) / 1.8)
//        println("${c}c는 ${"%.2f".format(res)}c입니다.")
//    }
//    else if(fc in "C" || fc in "c") {
//        res = ((c*1.8)+32)
//        println("${c}c는 ${"%.2f".format(res)}c입니다.")
//    }
//
//    else
//        println("다시 쓰시오.")

    println("==커피 주문하세요==")
    println("에프 2000원    아메 2500원    카푸 3000원")

    print("커피 선택 >> ")
    var menu = readln().toString()

    var ma: Int = 0
    var n: Int

    if(menu in "에프"){
        ma = 2000
        n = readln().toInt()
        println("${ma * n}원 입니다.")
    }
    else if(menu in "아메"){
        ma = 2500
        n = readln().toInt()
        println("${ma * n}원 입니다.")
    }
    else if(menu in "카푸"){
        ma = 3000
        n = readln().toInt()
        println("${ma * n}원 입니다.")
    }
    else {
        println("다시입력")
    }

}
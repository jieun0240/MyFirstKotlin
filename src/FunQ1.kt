fun funSales(price:Int, grade:String):Int{
    when(grade){
        "S" -> {
            println("S는 10% 할인")
            return (0.9*price).toInt()
        }
        "G" -> {
            println("G는 20% 할인")
            return (0.8*price).toInt()
        }
        "V" -> {
            println("V는 30% 할인")
            return (0.7*price).toInt()
        }
    }
    return 0
}

fun main(){
    print("구매 금액 입력 >> ")
    var pc = readln().toInt()

    print("등급을 입력하세요 >> ")
    var gd = readln()

    print("할인된 가격은 ${funSales(pc, gd)}")
}
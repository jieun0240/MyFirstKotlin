package Study

fun main() {

    val bookName= arrayOf<String>("java", "kotlin", "c", "c#")
    val bookPrice= arrayOf(10000, 20000, 30000, 10000)
    val stuDiscount=0.2f
    val teaDiscount=0.1f

    var book:String? =null
    var res=0.0f

    println("*** 미림서점 ***")
    print("book list :")
    bookName.forEach { print(it + " ") }
    println()

    while (true){
        println()
        var price=0
        print(" 원하는 책을 고르세요(그만하려면 exit)>>")
        book = readln()
        for(i in bookName.indices){
            if(bookName[i]==book){
                price= bookPrice[i]
                println("선택하신 책은 $book 입니다. 가격은 $price 입니다.")
                break
            }
        }
        if(price==0){
            println("일치하는 책이 없습니다. 책 제목을 다시 입력하세요.")
        }
        else{
            print(" 당신의 직업은(1. 학생 2. 선생님 3. 기타)>>")
            var jod = readln()
            when(jod){
                "1"->res=price.toFloat()*(1-stuDiscount)
                "2"->res=price.toFloat()*(teaDiscount)
                else->res=price.toFloat()
            }
            println("최종 금액은 ${res.toInt()}원 입니다.")
        }
    }


}
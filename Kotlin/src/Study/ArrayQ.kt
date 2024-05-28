package Study

fun main() {
    println("***미림서점***")
    var mutableBookList:MutableList<String> = mutableListOf()
    var bookName:String
    while (true){
        println("1. 도서삽입    2. 도서 리스트 출력    3. 종료>>")
        var menu = readln()
        when(menu){
            "1" -> {
                println("삽입할 도서 이름")
                bookName = readln()
                mutableBookList.add(bookName)
            }
            "2" -> {
                mutableBookList.forEach { println("$it \t") }
            }
            "3" -> break
        }
    }
}
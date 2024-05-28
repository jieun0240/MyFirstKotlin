package Study

fun main() {
    var lang: ArrayList<String> = ArrayList()
    lang.add("java")
    lang.add("kotlin")
    lang.add("C")

    lang.forEach{print("$it \t")}

    val langList: ArrayList<String> = arrayListOf("java", "kotlin", "C")
    langList.add("JSP")
    langList[2] = "Python"
    langList.remove("C")

    langList.forEach{print("$it \t")}
    
    val course: MutableList<String> = mutableListOf("창의적종합설계", "컴퓨터비전", "사물인터넷")
    course.add("모바일프로그래밍")
    course.removeAt(1)
    course[0] = "리눅스"

    course.forEach { print("$it \t") }

    var numbers: List<String> = listOf("1", "2", "3", "4", "5")
    var mutableNumbers = numbers.toMutableList()
    mutableNumbers.add("6")

    mutableNumbers.forEach { print("$it \t") }
}
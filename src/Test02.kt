fun main() {
    val ch = 'A'
    println(ch + 1)

    val kor = '\uD55C'
    println(kor)

    val code: Int = 65

    val chFromCode:Char = code.toChar()
    println(chFromCode)

    val num = 10
    val formatedString = """
        val a = 6
        var b = "Kotlin"
        println(a + num)    //문자열에 표현식 사용
        """
    println(formatedString)
    val a = 1
    val str1 = "a = $a"
    val str2 = "a = ${a + 2}"
    println("str1:\"$str1\", str2: \"$str2\"")

}
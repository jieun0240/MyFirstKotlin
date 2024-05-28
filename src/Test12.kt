fun main() {
    val a:Any = 10
    val b=a as Int
    println("${a+10}")
    println("===============================================================")

    val a2:Any = "10"
    val b2=a2 as? Int
    if(b2 != null) println("${b2+10}")
    else println(b2)
    println("===============================================================")

    var num1 = 10
    var num2 = 10
    val result1 = ++num1
    val result2 = num2++

    println("result1 :  $result1")
    println("result2 : $result2")
    println("num1 : $num1")
    println("num2 :  $num2")
    println("===============================================================")

    val number1 = 12
    val number2 = 25

    println(number1 > 20 || number2 > 20)
    println(number1 or number2)

    println(number1 and number2)
    println(number1 > 20 && number2 > 20)

    println(number1 xor number2)
    println("===============================================================")

    val data1: Int = 10
    val data2: Int = 10
    println("data1==data2 is ${data1==data2}")
    println("data1===data2 is ${data1===data2}")

    println()
    val int1 = Integer(10)
    val int2 = Integer(10)

    val int3=int1
    println("int==int2 is ${int1==int2}")
    println("int1===int2 is ${int1===int2}")
    println("int1==3 is ${int1==int3}")
    println("int1===int3 is ${int1===int3}")
    println("===============================================================")

    var str1: String = "hello"
    var str2 = "world"
    var str3 = "hello"

    println("str1 === str2: ${str1 === str2}")
    println("str1 === str3: ${str1 === str3}")

    var str4 = String(charArrayOf('h', 'e', 'l', 'l', 'o'))
    println("str1 === str4: ${str1 === str4}")
    println("str1 == str4: ${str1 == str4}")
    println("===============================================================")

    //Q1
    //불변의 변수를 선언할 떄는 val 가변의 변수를 선언할 떄는 var

    //Q2
    val abc:Int = 20

    //Q3
    var b_1:String?="abc"

    //Q4
    //4)?.

    //Q5
    //답X

    //Q6 (엘비스 연산자(null 허용 검사 ?:))
    var str = "Hello"
    var result = str ?.length?:0
}
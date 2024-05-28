fun main() {
    var menuList:MutableMap<String, Int> = mutableMapOf<String, Int>()
    println("아이스크림 이름과 가격을 입력하세요.")

    for (i in 1..5){
        print("이름, 가격 >> ")
        val(key, number) = readln().split(' ')
        var value: Int = number.toInt()
        menuList.put(key, value)
    }
    print("아이스크림 이름 : ")
    for(k in menuList.keys) print("${k} ")
    print("\n가격 : ")
    for(v in menuList.values) print("${v} ")

    println("\n아이스크림 총 가격 = ${menuList.values.sum()}")
}
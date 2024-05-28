fun main() {
    val nationList: MutableMap<String, Int> = mutableMapOf()

    println("5개의 나라 이름과 인구를 입력하세요:")

    for (i in 1..5) {
        print("나라 이름, 인구 입력 >> ")
        val (key, number) = readln().split(' ')
        val value: Int = number.toInt()
        nationList[key] = value
    }

    var maxPopulationCountry: String? = null
    var maxPopulation = 0

    for ((key, value) in nationList) {
        if (value > maxPopulation) {
            maxPopulation = value
            maxPopulationCountry = key
        }
    }
    println("가장 인구가 많은 나라는 ${maxPopulationCountry}이고, 인구는 ${maxPopulation}명입니다.")
}
fun main() {
    val muMap:MutableMap<Int, String> = mutableMapOf(1 to "java", 2 to "kotlin", 3 to "c")

    muMap.put(4, "JSP")
    muMap.remove(1)

    for((key, value) in muMap) {
        println("key=$key, value=$value")
    }
    println("첫번째 키: ${muMap.keys.first()}")
    println("마지막 키: ${muMap.keys.last()}")
}
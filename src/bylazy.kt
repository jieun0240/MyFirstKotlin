lateinit var text: String
val textLength: Int by lazy {
    text.length
}

fun main() {
    text="Kotlin"
    println("$text 의 길이 : $textLength")
}
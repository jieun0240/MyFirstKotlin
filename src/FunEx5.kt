fun findFirstName(vararg Names:String) {
    for (name in Names) {
        if (name.length == 3) {
            println("Found $name")
            return
        }
    }
}

fun main() {
    val s = arrayOf<String>("abcdefg", "aaa", "dd")
    findFirstName(*s)
}
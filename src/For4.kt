fun main() {
    var n = readln().toInt()

    for(line in 1..n) {
        for(j in 1..(n-line)) print(" ")
        for(j in 1..(2*line-1)) print("*")
        println()
    }
}
fun main() {
    var x = 0
    var sum = 0
    while(x < 10) {
        sum += ++x
    }
    println(sum)

    var x2 = 0
    var sum2 = 0
    while(true) {
        sum2 += ++x2
        if(x2 == 10)break
    }
    println(sum2)
    println("===============================================================================")

    var x3 = 0
    var sum3 = 0
    do {
        sum3 += ++x3
        if(x3 == 10)break
    }while(true)
    println(sum3)
}
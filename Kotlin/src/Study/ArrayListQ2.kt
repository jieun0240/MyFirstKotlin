package Study

fun main() {
    var scanList:ArrayList<Int> = arrayListOf()
    var max = 0

    for(i in 0..4){
        print("정수 ${i+1} 입력  > ")
        var scan = readln().toInt()
        scanList.add(scan)
        if(i == 0) max = scanList.get(0)
        if(max < scanList.get(i)) max = scanList.get(i)
    }

    println("최댓값 > $max")
}
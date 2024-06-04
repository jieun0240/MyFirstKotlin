package ClassTest

class Rect(var width: Int, var height: Int) {
    fun getArea(arrayList: ArrayList<Rect>): Int {
        var sum = 0

        for (i in arrayList) {
            sum += i.width * i.height
        }
        return sum
    }
}

fun main() {
    val arr:ArrayList<Rect> = ArrayList()

    for (i in 1..4) {
        print("너비와 높이 >> ")
        val (w, h) = readln().split(" ").map { it.toInt() }
        arr.add(Rect(w, h))
    }

    println("저장하였습니다...")
    val rect = Rect(0, 0)
    println("사각형의 전체 합은 ${rect.getArea(arr)}")
}
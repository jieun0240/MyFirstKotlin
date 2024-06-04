package ClassOpen

open class Potin(var x:Int=1, var y:Int=1){
    open fun getLocation():String{return "x:" + x + ", y:" + y}
}

class Point3D(x:Int, y:Int, var z:Int=1):Potin(x, y){
    override fun getLocation(): String {
        return super.getLocation()+ ", z:" + z
    }
}

fun main() {
    var point = Point3D(10, 20, 30)
    println(point.getLocation())
}
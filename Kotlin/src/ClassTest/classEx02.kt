class Users(name:String, count:Int) {
    var name : String
    var count : Int
    init {
        this.name=name
        this.count=count
    }
    fun sunFun() {
        println("name:$name, count:$count")
    }
}

fun main() {
    var user = Users("hong", 10)
    user.sunFun()
}
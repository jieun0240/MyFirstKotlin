var name:String = "kotlin"
var age:Int = 20

lateinit var dept: String   // 초기화 늦추기
val deptLength: Int by lazy {
    dept.length
}
fun main() {
    println("이름=$name")
    println("나이=${age+1}")

    dept="컴퓨터공학"
    println("학과=$dept") //$을 써서 출력해도 됨
    println("학과명 길이="+deptLength)   //자바처럼 출력해도 되고
}
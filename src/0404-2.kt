fun main() {
    val a=1
    when(a){
        1->println("a는 1")
        2->println("a는 2")
        3,4->println("a는 3 또는 4")
        else->{println("a is neither 1 nor 2")}
    }

    val data="Hello"
    when(data){
        "Hello"->println("data is Hello")
        "World"->println("data is World")
        else->println("data is npt Hello or World")
    }

    val hour = 10
    when{
        hour<12->println("오전")
        hour>=12&&hour<6->println("오후")
        else->println("저녁")
    }
}

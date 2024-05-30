package DataClass

//internal == defualt

data class Employee(val name:String, val age:Int, val salary:Int=1000)

fun avgAge(arr:ArrayList<Employee>):Double{
    var sum=0
    var cnt=0

    for(i in arr){
        sum+=i.age
    }
    return (sum.toDouble()/arr.size)
}

fun avgSalary(arr:ArrayList<Employee>):Double{
    var sum=0
    for(i in arr) sum+=i.salary
    return (sum.toDouble()/arr.size)
}
fun main() {
    var arr:ArrayList<Employee> = ArrayList()
    arr.add(Employee("kim", 35, 5000))
    arr.add(Employee("Hone", 25, 1000))
    arr.add(Employee("Lee", 55, 10000))
    arr.add(Employee("Cha", 21, 1000))

    for(i in arr)
        println("name=${i.name}\nage=${i.age}\nsalary=${i.salary}\n")

    println("평균 나이 : ${avgAge(arr)}")
    println("평균 급여 : ${avgSalary(arr)}")
}
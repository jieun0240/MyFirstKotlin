fun main() {
    var memberBook:MutableMap<String, String> = mutableMapOf<String, String>()
    insertEamil("w2303@e-mirim.hs.kr", memberBook)
    insertEamil("good@gmail.com", memberBook)
    insertEamil("good1@gmail.com", memberBook)
    for(id in memberBook.keys) println(id)
    for(domain in memberBook.values) println(domain)
}
fun insertEamil(email:String?, mBook:MutableMap<String, String>) {
    if(email===null) {
        println("이메일 주소 누락")
        return
    }
    var atPos=email.indexOf('@')
    if(atPos==-1 || atPos==email.lastIndex) {
        println("이메일 주소가 잘 못 되었습니다.")
        return
    }
    var key = email.substring(0..atPos-1)
    var value = email.substring(atPos+1..email.lastIndex)
    mBook.put(key, value)
}
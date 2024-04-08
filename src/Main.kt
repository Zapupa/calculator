fun main() {
    var number:String
    var answ = 0
    while(true){
        print(">>> ")
        number = readln()
        try {
            when(number[0]){
                '+' -> answ += number.substring(1).toInt()
                '-' -> answ -= number.substring(1).toInt()
                '*' -> answ *= number.substring(1).toInt()
                '/' -> answ /= number.substring(1).toInt()
                '=' -> {
                    print("Answer: $answ")
                    return
                }
                else -> answ = number.toInt()
            }
        }
        catch (e: java.lang.Exception){
            println("u are not allowed")
        }
    }
}
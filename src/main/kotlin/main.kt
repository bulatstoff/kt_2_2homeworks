fun main(args: Array<String>) {
    var likesCount = 1111
    var wordEndingunits = likesCount  % 10
    var wordEndingdozen = likesCount  % 100

    var message : String
    var f : Int
    if (wordEndingdozen>1&&wordEndingdozen<20){
        var message = "Людям"
        println("Понравилось "+likesCount +" "+ message)

    }else {
        wordEndingCalculate(wordEndingunits)
        println("Понравилось "+likesCount + " " + wordEndingCalculate(wordEndingunits))
    }
}
fun wordEndingCalculate(m : Int): String {
    if (m != 1) {
        var message = "Людям"
        return message

    }else {
        var message = "Человеку"
        return message
    }
}
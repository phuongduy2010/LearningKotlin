package idiom

fun String.reverse() = toCharArray().reversedArray()
fun String.sortStringAlphabetically() = toCharArray().sorted().joinToString(" ")
infix fun Int.times(str: String) = str.repeat(this)
infix fun String.onto(other: String) = Pair(this, other)
// operator fun Int.times(str: String) = str.repeat(this)
fun main(){
    val myName = "LY NHU Y"
    println(myName.reverse())
    val anyString: String = "kdanfkafbsdkaldsbak kfnsdfak"
    println(myName.sortStringAlphabetically())
    println(2 times "Bye ")
    val myPair = "McLaren".onto("Lucas")
    val myPair2 = "McLaren" onto "Lucas"
    println(myPair)
    println(myPair2)
}


package controlFlow

import kotlin.math.PI
fun main(){
    val expression = MyExpression()
    expression.printFizzBuzz()
    val list = expression.getListStartFromLetter(startLetter = "l")
    // val list = expression.getListStartFromLetter("l")
    for(item in list){
        println("Word start with l is $item")
    }
    expression.createUrlsFromActions()
}
class MyExpression {
    /**
     * return traffic action
     */
    public fun getTrafficLightAction(trafficLightState: String): String{
        val trafficAction = when(trafficLightState){
            "Red" -> "Stop"
            "Yellow" -> "Slow down"
            "Green" -> "Go"
            else -> "Malfunction"
        }
        return trafficAction
    }

    /**
     * return go action if the light is green otherwise return slow down then stop
     */
    public fun getTrafficLightAction(isGreen: Boolean): String{
        val trafficAction = when(isGreen){
            true -> "GO"
            false -> "Slow down and Stop"
        }
        return trafficAction
    }

    public fun printFizzBuzz(){
        for (number in 1..100){
            if(number%15==0){
                println("FizzBull")
            }
            else if(number%5==0){
                println("Bull")
            }
            else if(number%3==0){
                println("Fizz")
            }
            else println(number)
        }
    }
    public fun printFizzBuzzWhen(){
        for (number in 1..100){
            println(
            when{
                number%15==0 -> "FizzBull"
                number%5==0 -> "Bull"
                number%3==0 -> "Fizz"
                else -> number
            })
        }
    }
    public fun getListStartFromLetter(startLetter: String): List<String>{
        val words = listOf("dinosaur", "limousine", "magazine", "language")
        val newWords: List<String> = words.filter { word -> word.lowercase().startsWith(startLetter)}
        return  newWords
    }

//    public fun circleArea(radius: Int): Double{
//        return PI * radius * radius
//    }
    public fun circleArea(radius: Int) = PI * radius * radius

    public fun uppercaseString(text : String) = text.uppercase()

    public fun createUrlsFromActions(){
        val actions = listOf("title", "year", "author")
        val prefix = "https://example.com/book-info"
        val id = 5
        val urls = actions.map { action -> "${prefix}/$id/$action" }// Write your code here println(urls)
        println(urls)
    }
}
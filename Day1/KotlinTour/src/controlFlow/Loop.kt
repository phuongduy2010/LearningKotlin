package controlFlow

import collection.MyList
fun main(){
    val myLoop = MyLoop()
    myLoop.getFruit()
}
class MyLoop {
    public fun getFruit(){
        val myList: MyList = MyList()
        val fruits = myList.mutableList()
        for(fruit in fruits){
            println("Yummy, It is $fruit in fruits")
        }
    }
}
package collection

import kotlin.collections.List

fun main(){
    // read only list
    val myList = MyList()
    val readonlyShapes = myList.readonlyList()
    println("readonly list >> $readonlyShapes")
    println("last item in readonly list >> ${readonlyShapes.last()}")
    // mutable list
    val mutableShapes = myList.mutableList()
    println("mutableShapes list >> $mutableShapes")
    println("first item in mutableShapes list >> ${mutableShapes.first()}")
    println("Apple exist in the list ${myList.isExistItem("apple")}")
}
/**
 * Ordered collections of items
 * Lists store items in the order that they are added, and allow for duplicate items.
*/
class MyList {
    /**
     * Returns readonly lít.
     */
    public fun readonlyList(): List<String> {
        val readonlyShapes = listOf("triangle", "square", "circle")
        // explicit type
        // val readonlyShapes: List<String> = listOf("triangle", "square", "circle")
        return readonlyShapes
    }

    /**
     * Return mutable list
     */
    public fun mutableList(): List<String> {
        val shapes: MutableList<String> = mutableListOf("apple", "banana", "cherry")
        shapes.removeAt(0)
        return  shapes
    }

    /**
     * return true, if item exist in collection
     */
    public fun isExistItem(item: String): Boolean {
        val fruits = mutableList()
        return item in fruits
    }
}
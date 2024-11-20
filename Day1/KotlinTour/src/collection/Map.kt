package collection

fun main(){
    val myMap = MyMap()
    val readonlyMap: Map<String, Int> = myMap.readonlyMap();
    println("readonly Map >> $readonlyMap")
    println("get apple price from readonly map >> ${readonlyMap.get("apple")}")
    val mutableMap = myMap.mutableMap()
    println("Mutable Map >> $mutableMap")
    println("get apple price from mutable map ${mutableMap["apple"]}")
    println("Apple exist in the map ${myMap.isExistItem("apple")}")
}
/**
 * Sets of key-value pairs where keys are unique and map to only one value
 * Maps store items as key-value pairs. You access the value by referencing the key.
 * You can imagine a map like a food menu. You can find the price (value), by finding the food (key) you want to eat.
 * Maps are useful if you want to look up a value without using a numbered index, like in a list.
 */

class MyMap {
    /**
     * return read only map
     */
    public  fun readonlyMap() : Map<String, Int>{
        val readOnlyJuice: Map<String, Int> = mapOf("apple" to 100, "kiwi" to 190, "orange" to 150)
        return readOnlyJuice
    }

    /**
     * return mutable map
     */
    public fun mutableMap(): Map<String, Int>{
        val mutableJuice: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 150)
        return  mutableJuice
    }
    /**
     * return true, if item exist in collection
     */
    public fun isExistItem(item: String): Boolean {
        val fruits = readonlyMap()
        return item in fruits
    }

}
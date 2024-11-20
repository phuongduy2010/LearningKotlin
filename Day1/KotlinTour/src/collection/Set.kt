package collection
fun main(){
    val mySet = MySet()
    val fruitReadonlySet: Set<String> = mySet.getFruitsSet()
    println("fruit readonly set>> $fruitReadonlySet")

    val fruitMutableSet: MutableSet<String> = mySet.getFruitsMutable()
    println("fruit mutable set >> $fruitMutableSet")
}
/**
 * Unique unordered collections of items
 */

class MySet {
    /**
     * return collection of fruits
     */
    public fun getFruitsSet(): Set<String> {
        val readOnlySet = setOf("apple", "banana", "cherry", "banana")
        return readOnlySet
    }

    /**
     * return collection of fruits
     */
    public  fun getFruitsMutable(): MutableSet<String>{
        val mutableSet: MutableSet<String> = mutableSetOf("banana", "cherry", "apple", "cherry")
        return  mutableSet
    }
    /**
     * return true, if item exist in collection
     */
    public fun isExistItem(item: String): Boolean {
        val fruits = getFruitsSet()
        return item in fruits
    }

}
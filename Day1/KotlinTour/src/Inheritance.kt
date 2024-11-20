//abstract class Animal {
//    abstract fun sayHell()
//}

/**
 * Kotlin classes are final by default. If you want to allow the class inheritance, mark the class with the open modifier.
 */
open class Dog {
    /**
     * Kotlin methods are also final by default. As with the classes, the open modifier allows overriding them.
     */
    open fun sayHello(){
        println("wow wow")

    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wifi wifi")
    }
}

fun main(){
    val dog:Dog = Yorkshire();
    dog.sayHello()
}
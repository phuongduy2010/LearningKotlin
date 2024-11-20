package idiom

import java.math.BigDecimal

class TodoFunction {
    /**
     * Kotlin's standard library has a TODO() function that will always throw a NotImplementedError.
     * Its return type is Nothing so it can be used regardless of expected type
     */
    fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")
    fun test() = 2
}
fun main(){
    val todoObj = TodoFunction();
    with(todoObj) {
        println("calcTaxes() >> ${calcTaxes()}")
        println("test() >> ${test()}")
    }
}
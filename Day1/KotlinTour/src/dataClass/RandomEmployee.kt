package dataClass


import kotlin.random.Random

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    private val names = listOf("Tam", "Nghi", "Bao", "Phuc", "Thai", "Y")
    fun generateEmployee() =
        Employee(names.random(),
            Random.nextInt(from = minSalary, until = maxSalary))
}
// Write your code here

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
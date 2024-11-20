package dataClass

fun main() {
    val user = User(id="1", fullName = "LY NHU Y")
    val user1 = User("LY NHU Y", "1")
    val user2 = user1.copy(fullName = "Nghi Nguyen")
    println("user >> $user")
    println("user1 >> $user1")
    println(user1 == user)
    println(user1 == user2)
    val employee = Employee("LY NHU Y", 30)
    employee.salary+=50
    println(employee)
}

data class User(val fullName: String, val id: String)
data class Employee(val name: String, var salary: Int)

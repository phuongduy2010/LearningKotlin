package idiom

object Resource {
    private var name = "Ly Nhu Y"
    fun getResource() = name
}
fun main(){
    println(Resource.getResource())
}
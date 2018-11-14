package ws.tilda.anastasia.kotlinbasics.classes

data class CustomerKotlin (var id: Int, var name: String, var email: String)

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(1, "Anastasiia", "akarpenko@aalto.fi")
    val customer2 = CustomerKotlin(1, "Anastasiia", "akarpenko@aalto.fi")
    val customer3 = customer1 //can copy the objects

    if(customer1 == customer2) {
        println("They are the same")
    }

    println(customer3.email)
}
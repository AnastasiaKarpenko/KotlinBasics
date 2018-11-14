package ws.tilda.anastasia.kotlinbasics.classes

data class CustomerKotlin(var id: Int, var name: String, var email: String) {
    override fun toString(): String {
        return "{\"id\": \"$id\", \"name\": \"$name\", \"email\": \"$email\"}\n\n" //JSON style
    }
}

fun main(args: Array<String>) {
    val customer1 = CustomerKotlin(1, "Anastasiia", "akarpenko@aalto.fi")
    val customer2 = CustomerKotlin(1, "Anastasiia", "akarpenko@aalto.fi")
    val customer3 = customer1 //can copy the objects

    if (customer1 == customer2) {
        println("They are the same")
    }

    println(customer3.email)

    val customer4 = customer3.copy(email = "karpena2@aalto.fi") //also to copy the object and override the property if needed
    println(customer4)
}
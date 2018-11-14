package ws.tilda.anastasia.kotlinbasics.classes

// Constructor with properties inside
class Customer(var id: Int, var name: String) {
    init{
        name = name.toUpperCase()
    }
}

//Class with constructor that holds parameters, properties are initialized from these parameters
class CustomerTwo(initId: Int, initName: String) {
    var id: Int = initId
    var Name: String = initName
}

//Class with properties that are initialized right away
class CustomerThree {
    var id: Int = 1
    var Name: String = "Anastasiia"
}

fun main(args: Array<String>) {
    var customer = Customer(1, "Anastasiia")

    println(customer.name)

}
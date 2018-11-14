package ws.tilda.anastasia.kotlinbasics.classes

import java.lang.IllegalArgumentException
import java.util.*

// Constructor with properties inside
class Customer(var id: Int, var name: String, val yearOfBirth: Int) {

    val age : Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth // custom getter for the age property

    //Custom setter. Value is the value os the property that is passed
    var socialSecurityNumber: String = ""
        set(value) {
            if(!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
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
    var customer = Customer(1, "Anastasiia", 1986 )

    customer.socialSecurityNumber = "SN123"

    println(customer.age)

}
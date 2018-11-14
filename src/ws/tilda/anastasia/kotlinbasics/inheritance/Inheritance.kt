package ws.tilda.anastasia.kotlinbasics.inheritance

open class Person {
    open fun validate() {

    }
}

open class Customer : Person {
    final override fun validate() {

    }
    //IF we want to access primary constructor from secondary one, we use super()
    constructor(): super()
}

class SpecialCustomer: Customer() {
    fun validateSecondMethod() {

    }
}

data class CustomerEntity(val name: String): Person()

fun main(args: Array<String>) {
    val customer = Customer()
    customer.validate()
}
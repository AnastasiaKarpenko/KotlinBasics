package ws.tilda.anastasia.kotlinbasics.inheritance

interface  CustomerRepository {
    val isEmpty: Boolean // can have property that cannot be instantiated
        get() = true

    fun getById(id: Int): Customer

    //Can have default implementation
    fun store(obj:Customer) {
        //implement default code
    }
}

class SQLCustomerRepository: CustomerRepository {
    override val isEmpty: Boolean
        get() = false

    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {

    }

}
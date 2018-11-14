package ws.tilda.anastasia.kotlinbasics.inheritance

interface  CustomerRepository {
    val isEmplty: Boolean // can have property that cannot be instantiated

    fun getById(id: Int): Customer

    //Can have default implementation
    fun store(obj:Customer) {
        //implement default code
    }
}

class SQLCustomerRepository: CustomerRepository {
    override val isEmplty: Boolean
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun getById(id: Int): Customer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
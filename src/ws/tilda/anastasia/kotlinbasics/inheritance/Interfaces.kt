package ws.tilda.anastasia.kotlinbasics.inheritance

interface CustomerRepository {
    val isEmpty: Boolean // can have property that cannot be instantiated
        get() = true

    fun getById(id: Int): Customer

    //Can have default implementation
    fun store(obj: Customer) {
        //implement default code
    }
}

class SQLCustomerRepository : CustomerRepository {
    override val isEmpty: Boolean
        get() = false

    override fun getById(id: Int): Customer {
        return Customer()
    }

    override fun store(obj: Customer) {

    }
}

interface Interface1 {
    fun printA() {
        println("Interface 1")
    }
}

interface Interface2 {
    fun printA() {
        println("Interface 2")
    }
}

class Interface1and2Implementation: Interface1, Interface2 {
    override fun printA() {
        //We can specify which method of which interface we want to override, it methods have the same name in both interfaces
        super<Interface2>.printA()
    }


}
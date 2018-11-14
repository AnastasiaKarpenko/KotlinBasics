package ws.tilda.anastasia.kotlinbasics.inheritance

interface Repository<T> {
    fun getById(id: Int): T
    fun getAll(): List<T>
}

fun main(args: Array<String>) {
    val customerRepo = GenericRepository<Customer>()
    val customer = customerRepo.getById(0)

}
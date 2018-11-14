package ws.tilda.anastasia.kotlinbasics.inheritance

abstract class StoredEntity {
    abstract fun store()

    fun status(): String {
        return "Implemented"
    }
}

class Employee : StoredEntity() {
    override fun store() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {
    val se = Employee()
}
package ws.tilda.anastasia.kotlinbasics.classes

enum class Priority (val value: Int) {
    MINOR(-1) {
        override fun text(): String {
            return "[MINOR PRIORITY]"
        }

        override fun toString(): String {
            return "Minor priority"
        }
    },
    NORMAL(0) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    MAJOR(1) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    },
    CRITICAL(10) {
        override fun text(): String {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    };

    abstract fun text(): String //will have to implement it for each member
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority.toString())
    println(priority.value)
    println(priority.ordinal)

    for(priorityInList in Priority.values()) {
        println(priorityInList)
    }

    val p = Priority.valueOf("MINOR")
    println(p.toString())


}
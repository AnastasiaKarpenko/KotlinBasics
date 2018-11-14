package ws.tilda.anastasia.kotlinbasics.classes

enum class Priority (val value: Int) {
    MINOR(-1),
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}

fun main(args: Array<String>) {
    val priority = Priority.NORMAL
    println(priority.toString())
    println(priority.value)
    println(priority.ordinal)

    for(priorityInList in Priority.values()) {
        println(priorityInList)
    }

    val p = Priority.valueOf("MAJOR")
    println(p.ordinal)


}
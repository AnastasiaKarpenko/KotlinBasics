package ws.tilda.anastasia.kotlinbasics.tidbits

import java.io.BufferedReader
import java.io.FileReader
import java.lang.IllegalArgumentException
import java.lang.IndexOutOfBoundsException

class NotANumberException(message: String) : Throwable(message) {
}

fun checkIsNumber(obj: Any) {
    when (obj) {
        !is Int, Long, Float, Double -> throw NotANumberException("This is not a number")
    }
}


fun main(args: Array<String>) {
//
//    try {
//        checkIsNumber("A")
//    } catch (e: NotANumberException) {
//        println("${e.message}")
//    } catch (e: IllegalArgumentException) {
//        println("Do nothing!")
//    }

    val buffer = BufferedReader(FileReader("input.txt"))
    val result = try {
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    } catch (e: IndexOutOfBoundsException) {
        println("Exception handled")
        -1
    } catch (e: NotANumberException) {

    } finally {
        println("Closing")
        buffer.close()
    }
    println(result)


}
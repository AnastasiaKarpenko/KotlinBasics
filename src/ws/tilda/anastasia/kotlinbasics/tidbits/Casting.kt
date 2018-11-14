package ws.tilda.anastasia.kotlinbasics.tidbits

open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int) {
        if(days < 60) {
            println("You need more vacation")
        }
    }
}

class Contractor: Person() {

}

fun hasVacations(obj: Person) {
    if(obj is Employee) {
        obj.vacationDays(20) //we dont need explicitly cast it to type Employee because compiler uses smart casting and checks by itself beforehand
    } else {
        // smth else
    }
}

var input : Any = 10

fun main(args: Array<String>) {
    val str = input as? String
    println(str?.length) // use ? to provide safe casting, prints null as a string. But does not crash.

}
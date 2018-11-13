package ws.tilda.anastasia.kotlinbasics.basics

fun main(args: Array<String>) {

    /* Creating variable of type Integer. It is not a dynamic type. It is mutable variable declaration.
     * There is a type inference. Not necessarily we need to declare the type.
     */

    var streetNumber: Int
    streetNumber = 10
    var streetName: String = "High Street" //initialized

    streetName = "Central Lane" //Can be changed, therefore mutable.

    val zip = "E11 P1" //Immutable variable. When declared and initialized cannot be reassigned.

    val myLong = 10L
    val myFloat = 100F
    val myHex = 0x0F
    val myBinary = 0xb01

    val myInt = 100
    val myLongAgain: Long = myInt.toLong() // conversion of types. No implicit conversions in Kotlin, have to do everything explicitly

    // String
    val myChar = 'A'
    val myString = "My String"

    val escapeCharacters = "A new line \n"

    val rawString = "Hello " +
            "This is the second line " +
            "A third line "

    val multipleLines = """
                        This is a string
                        And this is another line
                        """
    //String interpolation

    val years = 10
    val message = "A decade is $years years"

    val name = "Mary"
    val anotherMessage = "Length of name is ${name.length}" //curly braces needed when using methods of the object


}
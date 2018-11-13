package ws.tilda.anastasia.kotlinbasics.basics

import ws.tilda.anastasia.kotlinbasics.basics.utils.someUtility //function automatically imported from the package
import ws.tilda.anastasia.kotlinbasics.basics.utils.someUtility as someAdditionalFunction //in case of conflicts to rename the imported function

fun main(args: Array<String>) {
    someUtility("Hello")
    someAdditionalFunction("Hi")
}
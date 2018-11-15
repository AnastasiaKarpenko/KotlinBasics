package ws.tilda.anastasia.kotlinbasics.tidbits

import ws.tilda.anastasia.kotlinbasics.classes.CustomerKotlin

fun capitalAndPopulation(capital: String): Pair<String, Long> {
    return Pair("Madrid", 2300000)
}

fun countryInformation(country: String): Triple<String, String, Long> {
    return Triple("Madrid", "Europe", 2300000)
}

fun main(args: Array<String>) {
    var result = capitalAndPopulation("Madrid")
    println(result.first)
    println(result.second)

    var countryInfo = countryInformation("Spain")
    println("${countryInfo.first} ${countryInfo.second} ${countryInfo.third}")

    // Deconstruction of the values, by calling the component1, component2 or component3
    val (capital, population) = capitalAndPopulation("Madrid")
    println(capital)
    println(population)

    // can assign the deconstructed values to the class
    val (id, name, email) = CustomerKotlin(1, "Anastasiia", "karpena2@aalto.fi")
    println(email)

    val listOfCapitalsAndCountries = listOf(Pair("Madrid", "Spain"), "Paris" to "France")
    for ((capital2, country) in listOfCapitalsAndCountries) {
        println("$capital2 - $country")
    }

}
package ws.tilda.anastasia.kotlinbasics.tidbits

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

}
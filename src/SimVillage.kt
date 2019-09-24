fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings house(s)")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    println(greetingFunction("Guyal", 2))
}
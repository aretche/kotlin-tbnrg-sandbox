fun main() {
    val greetingFunction = { playerName: String, numBuildings: Int ->
        val currentYear = 2018
        println("Adding $numBuildings house(s)")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
    runSimulation("Guyal", greetingFunction)
}

fun runSimulation(playeName: String, greetingFunction: (String, Int) -> String){
    val numBuildings = (1..3).shuffled().last()
    println(greetingFunction(playeName, numBuildings))
}
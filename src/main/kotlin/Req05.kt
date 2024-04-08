fun calculateConsumerPrice(factoryCost: Double): Double {
    if (factoryCost <= 12000.0) {
        return factoryCost * 1.05
    } else if (factoryCost in 12000.01..25000.0) {
        return (factoryCost * 1.1) + (factoryCost * 15/100)
    } else {
        return (factoryCost * 1.15) + (factoryCost * 20/100)
    }
}

fun main() {
    println("Digite o preço de fábrica: ")
    val factoryCost = readln().toDouble()
    val finalCost = calculateConsumerPrice(factoryCost)
    println("O preço final é: $finalCost")
}
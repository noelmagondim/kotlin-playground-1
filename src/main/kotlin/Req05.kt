fun calculateConsumerPrice(factoryCost: Double): Double {
    TODO("Use essa função para desenvolver sua lógica")
}

fun main() {
    println("Digite o preço de fábrica: ")
    val factoryCost = readln().toDouble()
    val finalCost = calculateConsumerPrice(factoryCost)
    println("O preço final é: $finalCost")
}
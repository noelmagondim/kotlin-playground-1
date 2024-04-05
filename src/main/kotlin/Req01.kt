fun calculateDiscount(originalPrice: Double): Double {
    val discount = originalPrice - originalPrice*10/100
    return discount
}

fun main() {
    println("Digite o valor do produto")
    val originalPrice = readln().toDouble()
    val newPrice = calculateDiscount(originalPrice)
    println("O valor com desconto de 10% é de: R$ $newPrice")
}

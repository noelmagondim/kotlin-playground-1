fun calculateFinalPrice(carValue: Double, installment: Int, surcharges: Array<Double>): Double {
    return when (installment) {
        1 -> (carValue - carValue * 0.2)
        12 -> (carValue * surcharges[0]) + carValue
        24 -> (carValue * surcharges[1]) + carValue
        36 -> (carValue * surcharges[2]) + carValue
        48 -> (carValue * surcharges[3]) + carValue
        60 -> (carValue * surcharges[4]) + carValue
        else -> 0.0
    }
}

fun main() {
    println("Informe o valor do veículo: ")
    val carValue = readln().toDouble()

    println("Digite o número referente a quantidade de parcelas: ")
    println("1 - 20% de desconto")
    println("12 - 6% de acréscimo")
    println("24 - 12% de acréscimo")
    println("36 - 18% de acréscimo")
    println("48 - 24% de acréscimo")
    println("60 - 30% de acréscimo")
    val installment = readln().toInt()
    val surcharges = arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)

    val finalValue = calculateFinalPrice(carValue, installment, surcharges)
    val installmentPrice = finalValue / installment

    println("O valor da parcela é de: $installmentPrice")
    println("O preço final é de: $finalValue")

}

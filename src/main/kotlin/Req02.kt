fun calculateCommission(salesAmount: Double): Double {
    val commission = salesAmount * 4/100
    return commission
}

fun calculateFinalSalary(baseSalary: Double, commission: Double): Double {
    val finalSalary = baseSalary + commission
    return finalSalary
}

fun main() {
    println("Digite o valor do seu salário fixo: ")
    val baseSalary = readln().toDouble()

    println("Digite o valor das suas vendas: ")
    val sales = readln().toDouble()
    val commission = calculateCommission(sales)
    val finalSalary = calculateFinalSalary(baseSalary, commission)

    println("Sua comissão foi de R$ $commission e seu salário final foi de R$ $finalSalary")
}
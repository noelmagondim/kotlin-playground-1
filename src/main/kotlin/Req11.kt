fun countNegativeNumbers(numbers: List<Double>): Int {
    return numbers.count{ it < 0.0 }
}

fun calculateSumOfPositiveNumbers(numbers: List<Double>): Double {
    val positiveNumbers = numbers.filter { it % 2 == 0.0 }
    val sum = positiveNumbers.reduce{ acc, number -> (acc + number) }
    return sum
}

fun main() {
    println("Infome 10 números reais separados por espaço")
    val numbers = readln().split(" ").map { it.toDouble() }

    val countNegativeNumbers = countNegativeNumbers(numbers)
    val sumPositiveNumbers = calculateSumOfPositiveNumbers(numbers)

    println("A quantidade de negativos é: $countNegativeNumbers")
    println("A soma de positivos é $sumPositiveNumbers")
}
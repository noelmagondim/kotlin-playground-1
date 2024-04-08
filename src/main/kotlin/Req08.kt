fun calculateSumEven(numbers: List<Int>): Int {
    val even = numbers.filter { it % 2 == 0 }
    val sum = even.reduce { acc, number -> (acc + number)}
    return sum
}

fun calculateSumOdd(numbers: List<Int>): Int {
    val odd = numbers.filter { it % 2 != 0 }
    val sum = odd.reduce { acc, number -> (acc + number)}
    return sum
}

fun main() {
    println("Informe 10 números separados por um espaço: ")
    val inputNumbers= readln()
    val numbers = inputNumbers.split(" ").map { it.toInt() }
    val sumEven = calculateSumEven(numbers)
    val sumOdd = calculateSumOdd(numbers)
    println("A soma dos números pares é: $sumEven")
    println("A soma dos números impares é: $sumOdd")
}
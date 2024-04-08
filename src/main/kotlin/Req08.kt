fun calculateSumEven(numbers: List<Int>): Int {
    TODO("Use essa função para desenvolver sua lógica")
}

fun calculateSumOdd(numbers: List<Int>): Int {
    TODO("Use essa função para desenvolver sua lógica")
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
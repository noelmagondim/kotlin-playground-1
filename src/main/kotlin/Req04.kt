fun calculateAverage(number1: Double, number2: Double): Double {
    TODO("Use essa função para desenvolver sua lógica")
}

fun calculateDifference(number1: Double, number2: Double): Double {
    TODO("Use essa função para desenvolver sua lógica")
}

fun calculateProduct(number1: Double, number2: Double): Double {
    TODO("Use essa função para desenvolver sua lógica")
}

fun calculateDivision(number1: Double, number2: Double): Double? {
    TODO("Use essa função para desenvolver sua lógica")
}

fun main() {
    println("Digite o primeiro número: ")
    val number1 = readln().toDouble()

    println("Digite o segundo número: ")
    val number2 = readln().toDouble()

    println("Escolha o número da função que deseja implementar:")
    println("1 - Média entre os números digitados" +
            "2 - Diferença do maior pelo menor" +
            "3 - Produto entre os números digitados" +
            "4 - Divisão do primeiro pelo segundo")
    val choise = readln().toDouble()

    val average = calculateAverage(number1, number2)
    val difference = calculateDifference(number1, number2)
    val product = calculateProduct(number1, number2)
    val division = calculateDivision(number1, number2)

    when (choise) {
        1.0 -> println("A média é $average")
        2.0 -> println("A diferença é $difference")
        3.0 -> println("O produto é $product")
        4.0 -> println("A divisão é $division")
    }
}
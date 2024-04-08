fun calculateAverage(number1: Double, number2: Double): Double {
    val average = (number1 + number2) / 2
    return average
}

fun calculateDifference(number1: Double, number2: Double): Double {
    val difference = if (number1 < number2) (number2 - number1) else (number1 - number2)
    return difference
}

fun calculateProduct(number1: Double, number2: Double): Double {
    val product = number1 * number2
    return product
}

fun calculateDivision(number1: Double, number2: Double): Double? {
    val division = if (number2 == 0.0) null else number1 / number2
    return division
}

fun main() {
    println("Digite o primeiro número: ")
    val number1 = readln().toDouble()

    println("Digite o segundo número: ")
    val number2 = readln().toDouble()

    println("Escolha o número da função que deseja implementar:")
    println("1 - Média entre os números digitados")
    println("2 - Diferença do maior pelo menor")
    println("3 - Produto entre os números digitados")
    println("4 - Divisão do primeiro pelo segundo")
    val choise = readln().toDouble()

    val average = calculateAverage(number1, number2)
    val difference = calculateDifference(number1, number2)
    val product = calculateProduct(number1, number2)
    val division = calculateDivision(number1, number2)

    when (choise) {
        1.0 -> println("A média é $average")
        2.0 -> println("A diferença é $difference")
        3.0 -> println("O produto é $product")
        4.0 -> {
            if (division != null){
                println("A divisão é $division")
            } else {
                println("Não é possível dividir por zero")
            }

        }
        else -> println("Opção inválida")
    }
}
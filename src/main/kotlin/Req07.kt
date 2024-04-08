fun calculateAverage(ages: List<Int>): Double {
    val numbers = ages
    val sum = numbers.reduce { acc, numero -> (acc + numero) }
    val average = sum / numbers.size
    return average.toDouble()
}

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    val list1 = weights
    val list2 = heights
    var count = 0
    for ((list1, list2) in list1.zip(list2)) {
        if (list1 > 90.0 && list2 < 1.50) {
            count += 1
        }
    }
    return count.toInt()

}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    val list1 = ages
    val list2 = heights
    var count = 0
    for ((list1, list2) in list1.zip(list2)) {
        if (list1 in 10..30 && list2 > 1.90) {
            count++
        }
    }
    val percentage = (count * 100) / list1.size
    return percentage.toInt()
}

fun main() {
    println("Digite a idade de 5 pessoas separadas por espaços: ")
    val input = readln()
    val ages = input.split(" ").map { it.toInt() }
    val average = calculateAverage(ages)
    println("Média das idades 25, 30, 35, 40, 45: $average")

    println("Digite o peso de 5 pessoas separadas por espaços: ")
    val inputWeights = readln()
    val weights = inputWeights.split(" ").map { it.toDouble() }

    println("Digite a altura de 5 pessoas separadas por espaços: ")
    val inputHeights = readln()
    val heights = inputHeights.split(" ").map { it.toDouble() }

    val count = countPeopleWeightHeight(weights, heights)
    println("A quantidade de pessoas com peso superior a 90kg e altura inferior a 1,50m é: $count")

    val percente = calculatePercentageAgeHeight(ages,heights)
    println("A porcentagem de pessoas com idade entre 10 e 30 anos que medem mais de 1,90m: $percente")
}
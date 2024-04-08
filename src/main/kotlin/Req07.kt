fun calculateAverage(ages: List<Int>): Double {
    val numbers = ages
    val sum = numbers.reduce { acc, numero -> (acc + numero) }
    val average = sum / 5
    return average.toDouble()
}

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    TODO("Use essa função para desenvolver sua lógica")
}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    TODO("Use essa função para desenvolver sua lógica")
}

fun main() {
    val ages = listOf(25, 30, 35, 40, 45)
    val average = calculateAverage(ages)
    println("Média das idades 25, 30, 35, 40, 45: $average")

}
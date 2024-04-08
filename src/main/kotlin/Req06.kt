fun calculateNewSalary(currentSalary: Double): Double {
    if (currentSalary <= 300.0) {
        return currentSalary * 1.5
    } else if (currentSalary in 300.01..500.0) {
        return currentSalary * 1.4
    } else if (currentSalary in 500.01..700.0) {
        return currentSalary * 1.3
    } else if (currentSalary in 700.01..800.0) {
        return currentSalary * 1.2
    } else if (currentSalary in 800.01..1000.0) {
        return currentSalary * 1.1
    } else {
        return currentSalary * 1.05
    }
}

fun main() {
    println("Informe seu salário atual")
    val currentSalary = readln().toDouble()
    val newSalary = calculateNewSalary(currentSalary)
    println("Seu novo salário é de: $newSalary")
}
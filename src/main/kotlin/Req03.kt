fun calculateYears(birthYear: Int, currentYear: Int): Int {
    val years = currentYear - birthYear
    return years
}

fun calculateMonths(birthYear: Int, currentYear: Int): Int {
    val months = calculateYears(birthYear, currentYear) * 12
    return months
}

fun calculateDays(birthYear: Int, currentYear: Int): Long {
    val year = calculateYears(birthYear, currentYear)
    val leapYear = year / 4
    val normalYear = year - leapYear
    val month = (calculateMonths(birthYear, currentYear) / 12).toLong()
    val days = (month * 31 * 7) + (month * 30 * 4) + (leapYear * 29) + (normalYear * 28)
    return days
}

fun calculateWeeks(birthYear: Int, currentYear: Int): Long {
    val weeks = calculateDays(birthYear, currentYear) / 7
    return weeks
}

fun main() {
    println("Digite o ano do seu nascimento: ")
    val birthYear = readln().toInt()

    println("Digite o ano atual: ")
    val currentYear = readln().toInt()

    val years = calculateYears(birthYear, currentYear)
    val months = calculateMonths(birthYear, currentYear)
    val days = calculateDays(birthYear, currentYear)
    val weeks = calculateWeeks(birthYear, currentYear)

    println("Sua idade em anos é $years")
    println("Sua idade em meses é $months")
    println("Sua idade em dias é $days")
    println("Sua idade em semanas é $weeks")
}
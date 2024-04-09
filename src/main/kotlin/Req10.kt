fun findMultiplesOf2(numbers: IntArray): List<Int> {
    val listMult2 = numbers.filter { it % 2 == 0 }
    return listMult2
}

fun findMultiplesOf3(numbers: IntArray): List<Int> {
    val listMult3 = numbers.filter { it % 3 == 0 }
    return listMult3
}

fun findMultiplesOf2And3(numbers: IntArray): List<Int> {
    val listMult23 = numbers.filter { it % 2 == 0 && it % 3 == 0 }
    return listMult23
}

fun main() {
    println("Informe 15 números separados por espaço: ")
    val numbers = readln().split(" ").map { it.toInt() }.toIntArray()
    val listMult2 = findMultiplesOf2(numbers)
    val listMult3 = findMultiplesOf3(numbers)
    val listMult23 = findMultiplesOf2And3(numbers)

    println("Números múltiplos de 02: $listMult2")
    println("Números múltiplos de 03: $listMult3")
    println("Números múltiplos de 02 e 03: $listMult23")
}

fun findMultiplesOf2(numbers: IntArray): List<Int> {
    TODO("Use essa função para desenvolver sua lógica")
}

fun findMultiplesOf3(numbers: IntArray): List<Int> {
    TODO("Use essa função para desenvolver sua lógica")
}

fun findMultiplesOf2And3(numbers: IntArray): List<Int> {
    TODO("Use essa função para desenvolver sua lógica")
}

fun main() {
    println("Informe 15 números separados por espaço: ")
    val numbers = readln().split(" ").map { it.toInt() }.toIntArray()
    val listMult2 = findMultiplesOf2(numbers)
    val listMult3 = findMultiplesOf3(numbers)
    val listMult23 = findMultiplesOf2And3(numbers)

    println("Números múltiplos de 02: $listMult2")
    println("Números múltiplos de 03: $listMult3")
    println("Números múltiplos de 03: $listMult23")
}

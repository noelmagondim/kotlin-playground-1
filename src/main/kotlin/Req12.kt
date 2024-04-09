fun multiplyLists(list1: List<Int>, list2: List<Int>, result: MutableList<Int>) {
    for (i in list1.indices) {
        result.add(list1[i] * list2[i])
    }
}

fun main() {
    println("Informe 10 números separados por espaço: ")
    val list1 = readln().split(" ").map { it.toInt() }

    println("Informe outros 10 números separados por espaço: ")
    val list2 = readln().split(" ").map { it.toInt() }

    val result: MutableList<Int> = mutableListOf()
    multiplyLists(list1, list2, result)

    println("O resultado da multiplicação de cada índice das listas é $result")
}

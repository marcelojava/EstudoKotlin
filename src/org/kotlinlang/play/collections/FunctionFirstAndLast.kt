package org.kotlinlang.play.collections

class FunctionFirstAndLast {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
}

fun main() {
    val functionFirstAndLast = FunctionFirstAndLast()
    val first = functionFirstAndLast.numbers.first()
    val last = functionFirstAndLast.numbers.last()

    val firtsEven = functionFirstAndLast.numbers.first {it % 2 == 0}
    val lastOdd = numbers.last { it % 2 != 0 }

    println("primeiro elemento da colecao : $first")
    println("ultimo elemento da colecao : $last")
    println("primeiro elemento do filtro : $firtsEven")
    println("ultimo elemento da filtro : $lastOdd")

}
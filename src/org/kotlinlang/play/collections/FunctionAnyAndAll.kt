package org.kotlinlang.play.collections

class FunctionsAny {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val anyNegative = numbers.any {it < 0}

    val anyGT6 = numbers.any {it > 6}
}

class FunctionAll {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val allEven = numbers.all {it % 2 == 0}

    val allLess6 = numbers.all {it < 6}
}

class FunctionNone {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val allEven = numbers.none { it % 2 == 1 }           // 2

    val allLess6 = numbers.none { it > 6 }
}

fun main() {
    val functionsAny = FunctionsAny()
    val functionsAll = FunctionAll()
    val functionNone = FunctionNone()

    println(functionsAny.anyNegative)
    println(functionsAny.anyGT6)

    println(functionsAll.allEven)
    println(functionsAll.allLess6)

    println(functionNone.allEven)
    println(functionNone.allLess6)
}
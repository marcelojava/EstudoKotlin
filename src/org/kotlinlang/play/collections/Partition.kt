package org.kotlinlang.play.collections

val numeros = listOf(1, -2, 3, -4, 5, -6)
val evenOdd = numeros.partition { it % 2 == 0 }
val postivesAndNegatives = numeros.partition { it > 0 }

fun main() {
    println(evenOdd)
    println(postivesAndNegatives)
}
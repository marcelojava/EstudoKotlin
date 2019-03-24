package org.kotlinlang.play.collections


val numbers : List<Int> = listOf(1, -2, -3, 4, 5)

fun main() {
    val positives = numbers.filter {number -> number > 0}
    val negatives = numbers.filter { it < 0 }

    println("Positives : ")
    positives.forEach {
        number -> println(number)
    }

    println("Negatives : ")
    negatives.forEach {
            number -> println(number)
    }
}


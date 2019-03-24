package org.kotlinlang.play.collections

val numberss = listOf(1, -2, 3, -4, 5, -6)

val doubled = numberss.map { x -> x * 2 }

val tripled = numberss.map { it * 3 }

fun main() {
    println("doubled")
    doubled.forEach {
        number -> println(number)
    }

    println("tripled")
    tripled.forEach {
            number -> println(number)
    }
}
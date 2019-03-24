package org.kotlinlang.play.collections

val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

val first = words.find {it.startsWith("some")}
val last = words.findLast {it.startsWith("some")}
val notting = words.find { it.contains("nothing") }

fun main () {
    println("o primeiro elemento encontrado foi $first")
    println("o ultimo elemento encontrado foi $last")
    println("o ultimo elemento encontrado foi $notting")
}
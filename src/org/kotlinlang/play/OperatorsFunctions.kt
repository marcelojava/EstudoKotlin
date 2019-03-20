package org.kotlinlang.play

fun main() {
    operator fun Int.times(str : String) = str.repeat(this)
    println(10 * "Bye ")

    operator fun String.get(range : IntRange) = substring(range)
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])
}
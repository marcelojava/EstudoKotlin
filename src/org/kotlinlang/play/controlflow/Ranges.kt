package org.kotlinlang.play.controlflow

fun main() {
    for (i in 1..3) {
        println(i)
    }
    println(" ")

    for(i in 2..8 step 2) {
        println(i)
    }
    println(" ")

    for (i in 3 downTo 8) {
        println(i)
    }
    println(" ")

    for (c in 'a'..'z') {
        println(c)
    }
    println(" ")

    for (c in 'z' downTo 's' step 2) {
        println(c)
    }
    println(" ")
}
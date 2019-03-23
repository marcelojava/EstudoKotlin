package org.kotlinlang.play.controlflow

fun main() {
    println(max(99, -42))
}

fun max(a : Int, b : Int) = if (a > b) a else b

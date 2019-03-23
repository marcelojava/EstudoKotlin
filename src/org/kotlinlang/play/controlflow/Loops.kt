package org.kotlinlang.play.controlflow

fun main() {
    //loopFor()
    //loopWhile()
    loopDoWhile()
}

fun loopFor() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Que da hora esse bolo de $cake")
    }
}

fun loopWhile() {
    var cakesEaten = 0

    while (cakesEaten < 5) {
        eatACake()
        cakesEaten++
    }
}

fun loopDoWhile() {
    var cakesEaten = 0

    do {
        eatACake()
        cakesEaten++
    } while(cakesEaten < 5)
}

fun eatACake() = println("Eat a Cake")


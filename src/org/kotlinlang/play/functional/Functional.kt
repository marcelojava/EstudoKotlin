package org.kotlinlang.play.functional

fun soma(a : Int, b : Int) = a + b
fun multipicar(a : Int, b : Int) =  a * b

fun calcular(a: Int, b : Int, operation: (Int, Int) -> Int) : Int {
        return operation(a, b)
}

fun main() {
    println(calcular(10, 10, ::soma))
    println(calcular(10, 10, ::multipicar))
}
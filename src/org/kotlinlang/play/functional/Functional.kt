package org.kotlinlang.play.functional

class Calculadora {

    fun soma(a : Int, b : Int) = a + b
    fun multipicar(a : Int, b : Int) =  a * b

    fun calcular(a: Int, b : Int, operation: (Int, Int) -> Int) : Int {
        return operation(a, b)
    }
}


fun main() {
    val calc = Calculadora()
    println(calc.calcular(10, 10, calc::soma))
    println(Calculadora().calcular(10, 10, calc::multipicar))
}
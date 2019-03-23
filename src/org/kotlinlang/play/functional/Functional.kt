package org.kotlinlang.play.functional

class Calculadora {

    fun soma(a : Int, b : Int) = a + b
    fun multipicar(a : Int, b : Int) =  a * b

    fun calcular(a: Int, b : Int, operation: (Int, Int) -> Int) : Int  = operation(a, b)

    fun operacao() : (Int) -> Int {
        return ::quadrado
    }

    fun quadrado(x : Int) = x * x
}


fun main() {
    val calc = Calculadora()
    println(calc.calcular(10, 10, calc::soma))
    println(calc.calcular(10, 10, calc::multipicar))

    val func = calc.operacao()
    println(func(2))
}


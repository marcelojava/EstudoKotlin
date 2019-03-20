package org.kotlinlang.play

fun printMessage(message : String) : Unit {
    println(message)
}

fun printMessageWithPrefix(message : String, prefix : String = "png")  {
    println("[$prefix] $message")
}

fun sum(x : Int, y : Int) : Int {
    return x + y
}

fun multiply(x : Int, y : Int) : Int {
    return x * y;
}

fun main(){
    printMessage("Marcelo")
    printMessageWithPrefix("Marcelo")
    println("Soma dos valores " + sum(10, 10))
    println("Multiplicacao dos valores " + multiply(10, 10))
}
package org.kotlinlang.play

fun main() {
    cases(true)
    println(casesRetorno(1))
}

//metodo sem retorno
fun cases(args : Any) : Unit{
    when (args) {
        1 -> println("One")
        "Hello" -> println("Greating")
        is Long -> println("Is long")
        !is String -> println("Not is a String")
        else -> println("Unknown")
    }
}

fun casesRetorno(args : Any) : Any {
    return when (args) {
        1 -> "One"
        "Hello" -> "Greating"
        is Long -> "Is long"
        !is String -> "Not is a String"
        else -> "Unknown"
    }
}
class MyClass
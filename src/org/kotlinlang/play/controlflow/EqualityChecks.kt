package org.kotlinlang.play.controlflow

fun main() {
    val nomesOrdem = setOf("Marcelo", "Jessyca", "Alice")
    val nomesEmOutraOrdem = setOf("Alice", "Marcelo", "Jessyca")

    //retorna true pois em elementos sao iguais
    //comparando com o java == do kotlin seria igual a == null ? b == null : a.equals(b)
    println(nomesOrdem == nomesEmOutraOrdem)

    //retorna false pois === compara tambem a sequencia
    println(nomesOrdem === nomesEmOutraOrdem)
}
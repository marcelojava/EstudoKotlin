package org.kotlinlang.play.collections

val usuariosSistema : MutableList<Int>  = mutableListOf(1, 2, 3)
val usuarios : List<Int> = usuariosSistema


fun addUsuario(novoUsuario : Int) = usuariosSistema.add(novoUsuario)

fun pegarUsuariosDoSistema(): List<Int>  = usuarios

fun main() {
    println("tamano de usuarios ${pegarUsuariosDoSistema().size}")
    addUsuario(4)
    println("tamano de usuarios ${pegarUsuariosDoSistema().size}")

    pegarUsuariosDoSistema().forEach {
        usuario -> println("${usuario}")
    }
}
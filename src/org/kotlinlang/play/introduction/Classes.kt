package org.kotlinlang.play.introduction

class Custumer

class Contact(val id : Int, var email : String)

fun main() {
    val custumer = Custumer()
    val contact = Contact(1, "marcelo.iron@gmail.com")

    println(contact.id)
    println(contact.email)
    contact.email = "teste@teste.com.br"
    println(contact.email)
}
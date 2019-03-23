package org.kotlinlang.play.specialclasses

data class User(val name : String, val id : Int)

fun main() {
    val user = User("Marcelo", 1)
    println(user)

    val secondUser = User("Jessyca", 1)
    val thirdUser = User("Alice", 2)

    println(secondUser)
    println(thirdUser)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println(user.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())
    println(user.copy("Severina"))
    println(user.copy(id = 2))

    println("name  = ${user.component1()}")
    println("id  = ${user.component2()}")
}
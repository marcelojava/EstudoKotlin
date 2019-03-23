package org.kotlinlang.play.introduction

fun main() {
    infix fun Int.times(str : String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Marcelo" to "Jessyca"
    println(pair)

    infix fun String.onto(other:String) = Pair(this, other)
    val myPair = "Mclarem" onto "Lucas"
    println(myPair)

    val marcelo = Person("Marcelo")
    val jessyca = Person("Jessyca")
    val alice = Person("Alice")

    marcelo likes jessyca
    marcelo likes alice
}

class Person(val name : String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other)}
}
package org.kotlinlang.play.controlflow

class Animal(val name : String)

class Zoo(val animals : List<Animal>) {
        operator fun iterator(): Iterator<Animal> {
            return animals.iterator()
        }
}

fun main() {
    val zoo = Zoo(
        listOf(
            Animal("Macaco"),
            Animal("leao")
        )
    )

    for (animal in zoo) {
        println(animal.name)
    }
}
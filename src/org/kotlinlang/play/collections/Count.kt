package org.kotlinlang.play.collections

class Count {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val count = numbers.count()
    val countPredicate = numbers.count { it % 2 == 0 }
}

fun main() {
    val count = Count()
    println(count.count)
    println(count.countPredicate)
}
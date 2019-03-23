package org.kotlinlang.play.introduction

fun main() {
    printAll("Marcelo", "Jessyca", "Alice", "你好")
    printAllWithPrefix("Marcelo", "Jessyca", "Alice", "你好", prefix = "Greeting: ")
    log("marcelo", "teste", "teste2")
}

fun printAll(vararg str: String) {
    for (s in str) println(s)
}

fun printAllWithPrefix(vararg str: String, prefix : String) {
    for (s in str) println(prefix + s)
}

fun log(vararg log : String) {
    printAll(*log)
}
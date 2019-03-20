package org.kotlinlang.play

fun main() {
    var neverNull : String = "This can't be null"
    println(neverNull)

    var canBeNull : String? = "nada"
    canBeNull = null
    println(canBeNull)

    println(describeString("Marcelo"))
    println(describeString(null))
}

fun describeString(str : String?) : String{
    when (!str.isNullOrBlank()) {
        true -> return "String of length ${str.length}"
        false -> return "Empty or null string"
    }
}
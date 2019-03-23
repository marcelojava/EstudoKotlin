package org.kotlinlang.play.functional

fun main() {
    val upperCase1 : (String) -> String = {str:String -> str.toUpperCase()}
    val upperCase2 : (String) -> String = {str -> str.toUpperCase()}
    val upperCase3 = {str :  String -> str.toUpperCase()}
    val upperCase4 : (String) -> String = {it.toUpperCase()}
    val upperCase5 : (String) -> String = String::toUpperCase

    println(upperCase1("marcelo"))
    println(upperCase2("marcelo"))
    println(upperCase3("marcelo"))
    println(upperCase4("marcelo"))
    println(upperCase5("marcelo"))
}
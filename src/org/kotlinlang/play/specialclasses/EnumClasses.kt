package org.kotlinlang.play.specialclasses

enum class State {
    IDLE, RUNNING, FINISHED
}

fun main() {
    println(printState(State.FINISHED))
    println(printState(State.IDLE))
    println(printState(State.RUNNING))
}

fun printState(state : State) : String {
    return when (state) {
        State.IDLE -> "Status IDLE"
        State.RUNNING -> "Status RUNNING"
        State.FINISHED -> "Status FINISHED"
    }
}
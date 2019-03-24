package org.kotlinlang.play.collections

val openIssues : MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssues(issue : String) : Boolean = openIssues.add(issue)

fun getStatusLog(isAdd : Boolean) : String {
    return if (isAdd) "registered correctly" else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssues(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssues(anIssueAlreadyIn))}")
}
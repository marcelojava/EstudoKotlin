package org.kotlinlang.play.collections

data class Person(val nome : String, val cidade : String, val telefone : String)


val people = listOf(Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

val mapaTelefonePessoa = people.associateBy { it.telefone }
val mapaTelefoneNome = people.associateBy (Person::telefone, Person::nome)
val mapaCidadeNome = people.groupBy(Person::cidade, Person::nome)

fun main() {
    println(mapaTelefonePessoa)
    println(mapaTelefoneNome)
    println(mapaCidadeNome)
}
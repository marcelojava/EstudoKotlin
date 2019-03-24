package org.kotlinlang.play.functional

data class Item(val nome : String, val preco : Float)

data class Pedido(val itens : Collection<Item>)

fun Pedido.valorProdutoDeMaiorPreco() : Float = this.itens.maxBy { it.preco }?.preco?: 0F
fun Pedido.nomeProdutoDeMaiorPreco()  : String = this.itens.maxBy { it.preco }?.nome?: "NAO_EXISTE_PRODUTO"
fun Pedido.valorProdutoDeMenorPreco() : Float = this.itens.minBy { it.preco}?.preco?: 0F;

val Pedido.separarNomesItemPorVirgula : String
    get() = itens.map { it.nome }.joinToString()

fun main() {
    val itens = listOf(Item("pao", 1.50F), Item("bolacha", 5.50F),
        Item("agua", 0.9F))

    val pedido = Pedido(itens)

    println("Valor maximo preco : ${pedido.valorProdutoDeMaiorPreco()}")
    println("Valor minimo preco : ${pedido.valorProdutoDeMenorPreco()}")
    println("Nome maximo preco : ${pedido.nomeProdutoDeMaiorPreco()}")
    println("Itens : ${pedido.separarNomesItemPorVirgula}")
}
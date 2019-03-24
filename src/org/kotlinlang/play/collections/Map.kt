package org.kotlinlang.play.collections

const val BASE_CALCULO : Float = 1.5F
val mapaDeContas : MutableMap<String, Float> = mutableMapOf("1111" to 15.0F, "2222" to 55.05F)
val mapaDeContasReport : Map<String, Float> = mapaDeContas

fun adicionarPontosCreadito(contaId : String, valorCompra : Float) {
    if (mapaDeContas.containsKey(contaId)) {
        println("Alterando $contaId com saldo atual de ${mapaDeContas.getValue(contaId)}")
        val novaPontuacao : Float = calcularCreditoPorValor(valorCompra)
        mapaDeContas[contaId] = mapaDeContas.getValue(contaId) + novaPontuacao
        println("Alterada $contaId com saldo atual de ${mapaDeContas.getValue(contaId)}")
    }else {
        println("Conta $contaId não existe")
    }
}

fun calcularCreditoPorValor(valor : Float) : Float = valor * BASE_CALCULO

fun contaRelatorio() {
    println("Imprimindo relatorio")
    mapaDeContasReport.forEach {
        k, v -> println("Conta $k: saldo $v")
    }
}

fun main() {
    contaRelatorio()
    adicionarPontosCreadito("1111", 10F)
    adicionarPontosCreadito("3333", 10F)
    contaRelatorio()
}
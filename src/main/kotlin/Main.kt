fun main(args: Array<String>) {
    val vendas=Vendas()
    //Etapa 1 sem deesconto
    val pedido= listOf("Maçã","Laranja","maçã","maçã")
    println(vendas.pedidoSemDesconto(pedido))

    //Etapa 2 com desconto
    val pedido1= listOf("Maçã", "Maçã", "Maçã", "Maçã")
    val pedido2= listOf("Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja")
    val pedido3 = listOf("Maçã", "Maçã", "Laranja", "Maçã")
    println(vendas.pedidoComDesconto(pedido1))
    println(vendas.pedidoComDesconto(pedido2))
    println(vendas.pedidoComDesconto(pedido3))

}
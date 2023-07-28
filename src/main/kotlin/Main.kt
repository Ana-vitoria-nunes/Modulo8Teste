fun main(args: Array<String>) {
    val vendas = Vendas()
    println("Etapa 1")
    //Etapa 1 sem deesconto
    val pedido = listOf("Maçã", "Laranja", "maçã", "maçã")
    println(vendas.mostrarLista(pedido))
    println("Total do pedido ${vendas.pedidoSemDesconto(pedido)}")

    println()
    println("Etapa 2")
    //Etapa 2 com desconto
    val pedido1 = listOf("Maçã", "Maçã", "Maçã", "Maçã")
    val pedido2 = listOf("Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja")
    val pedido3 = listOf("Maçã", "Maçã", "Laranja", "Maçã")

    println(vendas.mostrarLista(pedido1))
    println("Total do pedido ${vendas.pedidoComDesconto(pedido1)}")
    println(vendas.mostrarLista(pedido2))
    println("Total do pedido ${vendas.pedidoComDesconto(pedido2)}")
    println(vendas.mostrarLista(pedido3))
    println("Total do pedido ${vendas.pedidoComDesconto(pedido3)}")

    println()
    println("Etapa 3")
    //Etapa3 Status Pedido
    val pedido4 = listOf("maçã", "maçã", "laranja", "maçã")
    println(vendas.mostrarLista(pedido4))
    println("Total do pedido ${vendas.pedidoComDesconto(pedido4)}")
    println(vendas.concluirPedido(pedido4, "Em analise", "45 minutos"))

    println()
    println("Etapa 4")
    //Etapa4 verifivar estoque
    val pedido5 = listOf("maçã", "maçã", "maçã", "maçã", "laranja", "laranja")
    val pedido6 = listOf("maçã", "maçã", "laranja", "laranja")
    println(vendas.processarPedido(pedido5))
    println()
    println(vendas.mostrarLista(pedido5))
    println(vendas.processarPedido(pedido6))

}
class Vendas {
    val maca = 0.60
    val laranja = 0.25
    var total = 0.0


    //-----Etapa1-----\\
    fun pedidoSemDesconto(pedido: List<String>): Double {
        for (pedidos in pedido) {
            if (pedidos.equals("maça", ignoreCase = true)) {
                total += maca
            } else if (pedidos.equals("laranja", ignoreCase = true)) {
                total += laranja
            }
        }

        return total
    }

    //-----Etapa2-----\\
    fun pedidoComDesconto(pedido: List<String>): Double {
        val macas = pedido.count { it.toLowerCase() == "maçã" }
        val laranjas = pedido.count { it.toLowerCase() == "laranja" }

        val macasComDesconto = macas / 2 + macas % 2

        val laranjasComDesconto = (laranjas / 3) * 2 + laranjas % 3

        total = (macasComDesconto * maca) + (laranjasComDesconto * laranja)
        return total
    }

    //-----Etapa3-----\\
    fun concluirPedido(produtos: List<String>, status: String, tempoEstimadoEntrega: String): String {

        return "Notificação: Seu pedido está $status. Tempo estimado de entrega: $tempoEstimadoEntrega"
    }

    //-----Etapa4-----\\
}
class Vendas {
    val maca=0.60
    val laranja=0.25
    var total=0.0
    fun pedidoSemDesconto(pedido: List<String>):Double{
        for (pedidos in pedido) {
            if (pedidos.equals("maça", ignoreCase = true)) {
                total+=maca
            } else if (pedidos.equals("laranja", ignoreCase = true)) {
                total+=laranja
            }
        }

        return total
    }
    fun pedidoComDesconto(pedido: List<String>): Double {
        val macas = pedido.count { it.toLowerCase() == "maçã" }
        val laranjas = pedido.count { it.toLowerCase() == "laranja" }

        val macasComDesconto = macas / 2 + macas % 2

        val laranjasComDesconto = (laranjas / 3) * 2 + laranjas % 3

        val valorTotal = (macasComDesconto * maca) + (laranjasComDesconto * laranja)
        return valorTotal
    }
}
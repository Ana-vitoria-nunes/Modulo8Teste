class Vendas {
    val maca=0.60
    val laranja=0.25
    var total=0.0
    fun pedidoSimples(pedido: List<String>):Double{
        for (pedidos in pedido) {
            if (pedidos.equals("maça", ignoreCase = true)) {
                total+=maca
            } else if (pedidos.equals("laranja", ignoreCase = true)) {
                total+=laranja
            }
        }
        return total
    }
}
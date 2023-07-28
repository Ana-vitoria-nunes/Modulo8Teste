import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
class VendasTest {
    private val vendas=Vendas()

    //-----teste Etapa 1-----\\
    @Test
    fun deveRetornarOvalorTotalCorreto() {
        // Teste para uma lista de produtos válidos
        val pedidoCerto = listOf("Maça", "laranja", "Laranja")
        val totalCerto = vendas.pedidoSemDesconto(pedidoCerto)
        assertEquals(2.05, totalCerto, 0.01)
    }
    @Test
    fun deveRetornarOvalorTotalCorretoComFrutasInvalidas() {
        // Teste para produtos inválidos
        val pedidoInvalido = listOf("Pessego", "Maça", "manga", "Maça")
        val totalIvalido = vendas.pedidoSemDesconto(pedidoInvalido)
        assertEquals(1.20, totalIvalido, 0.01)
    }
    @Test
    fun deveRetornarOvalorTotalCorretoComAListaVazia(){
        // Teste para uma lista vazia de produtos
        val pedidoVazio= listOf<String>()
        val totalVazio=vendas.pedidoSemDesconto(pedidoVazio)
        assertEquals(0.0,totalVazio,0.01)
    }

    //-----teste Etapa 2-----\\
    @Test
    fun deveRetornarOvalorTotalCorretoComDesconto(){
        // Teste para uma lista com desconto
        val pedido1= listOf("Maçã", "Maçã", "Maçã", "Maçã")
        val pedido2= listOf("Laranja", "Laranja", "Laranja", "Laranja", "Laranja", "Laranja")
        val pedido3 = listOf("Maçã", "Maçã", "Laranja", "Maçã")
        val total1=vendas.pedidoComDesconto(pedido1)
        val total2=vendas.pedidoComDesconto(pedido2)
        val total3=vendas.pedidoComDesconto(pedido3)
        assertEquals(1.20,total1,0.01)
        assertEquals(1.00,total2,0.01)
        assertEquals(1.45,total3,0.01)
    }

    //-----teste Etapa 3-----\\
    @Test
    fun testConcluirPedido_NotificacaoEnviada1() {
        val produtos = listOf("Maçã", "Maçã", "Laranja", "Maçã")
        val status = "Em analise"
        val tempoEstimadoEntrega = "45 minutos"
        val notificacao = vendas.concluirPedido(produtos, status, tempoEstimadoEntrega)

        val expectativaDestatus = "Notificação: Seu pedido está Em analise. Tempo estimado de entrega: 45 minutos"
        assertEquals(expectativaDestatus, notificacao)
    }

    //-----teste Etapa 4-----\\
    @Test
    fun testProcessarPedido_EstoqueSuficiente() {
        val pedidos = listOf("maçã", "maçã", "laranja")

        val pedido = Vendas()
        val notificacao = pedido.processarPedido(pedidos)

        val expectedNotification = "Notificação: Seu pedido está Concluído. Tempo estimado de entrega: 30 minutos"
        assertEquals(expectedNotification, notificacao)
    }

    @Test
    fun testProcessarPedido_EstoqueInsuficiente() {
        val pedidos = listOf("maçã", "maçã", "maçã", "maçã", "laranja", "laranja")

        val pedido = Vendas()
        val notificacao = pedido.processarPedido(pedidos)

        val expectedNotification = "Desculpe, não temos estoque suficiente para atender ao seu pedido."
        assertEquals(expectedNotification, notificacao)
    }
}
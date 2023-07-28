import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class VendasTest {
    private val vendas=Vendas()
    @Test
    fun deveRetornarOvalorTotalCorreto() {
        // Teste para uma lista de produtos válidos
        val pedidoCerto = listOf("Maça", "Maça", "Laranja", "Maça")
        val totalCerto = vendas.pedidoSimples(pedidoCerto)
        assertEquals(2.05, totalCerto, 0.01)
    }
    @Test
    fun deveRetornarOvalorTotalCorretoComFrutasInvalidas() {
        // Teste para produtos inválidos
        val pedidoInvalido = listOf("Pessego", "Maça", "manga", "Maça")
        val totalIvalido = vendas.pedidoSimples(pedidoInvalido)
        assertEquals(1.20, totalIvalido, 0.01)
    }
    @Test
    fun deveRetornarOvalorTotalCorretoComAListaVazia(){

        // Teste para uma lista vazia de produtos
        val pedidoVazio= listOf<String>()
        val totalVazio=vendas.pedidoSimples(pedidoVazio)
        assertEquals(0.0,totalVazio,0.01)
    }
}
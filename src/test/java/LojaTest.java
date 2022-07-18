import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    public void deveRetornarCartaoCredito(){
        Loja lojasAfricanas = new Loja("Afriacanas");

        assertEquals("Compra emitida!\n" +
               "Nota fiscal n: 1\n" +
               "Loja: Afriacanas\n" +
               "Valor: 999.0",lojasAfricanas.executarCompra(999.00, new PagamentoCartaoCredito()));
    }

    @Test
    public void deveRetornarBoleto(){
        Loja lojasAfricanas = new Loja("Afriacanas");

        assertEquals("Boleto criado!\n" +
                "Nota fiscal n: 1\n" +
                "Loja: Afriacanas\n" +
                "Valor: 49.0", lojasAfricanas.executarCompra(49.00, new PagamentoBoleto()));
    }

    @Test
    public void deveRetornarCartaoDebito(){
        Loja lojasAfricanas = new Loja("Afriacanas");

        assertEquals("Compra debitada!\n" +
                "Nota fiscal n: 1\n" +
                "Loja: Afriacanas\n" +
                "Valor: 99.0", lojasAfricanas.executarCompra(99.00, new PagamentoCartaoDebito()));
    }

}
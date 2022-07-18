public class Loja {
    protected String nomeDaLoja;

    public Loja(String nome) {
        nomeDaLoja = nome;
    }

    public String executarCompra(double valor, PagamentoCommand formaDePagamento) {
        Compra compra = new Compra(nomeDaLoja);
        compra.setValor(valor);
        return formaDePagamento.processarCompra(compra);
    }
}

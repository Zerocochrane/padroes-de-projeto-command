public class PagamentoCartaoCredito implements PagamentoCommand {

    @Override
    public String processarCompra(Compra compra) {
        return "Compra emitida!\n" + compra.getInfoNota();
    }

}

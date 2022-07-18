public class PagamentoCartaoDebito implements PagamentoCommand {

    @Override
    public String processarCompra(Compra compra) {
        return "Compra debitada!\n" + compra.getInfoNota();
    }

}

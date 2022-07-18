public class PagamentoBoleto implements PagamentoCommand {

    @Override
    public String processarCompra(Compra compra) {
        return "Boleto criado!\n" + compra.getInfoNota();
    }

}

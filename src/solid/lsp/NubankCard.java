package solid.lsp;

abstract public class NubankCard implements IPaymentInstrument {

    @Override
    public void validate() throws Exception {

    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento realizado");
    }
}

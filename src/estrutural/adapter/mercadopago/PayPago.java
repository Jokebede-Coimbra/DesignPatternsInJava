package estrutural.adapter.mercadopago;

import estrutural.adapter.utils.Token;

public class PayPago implements IPayPagoPayments {

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypagoPayment() {
        System.out.println("Enviando pagamentos via PayPago.");
    }

    @Override
    public void paypagoReceive() {
        System.out.println("Recebendo pagamentos via PayPago.");
    }
}

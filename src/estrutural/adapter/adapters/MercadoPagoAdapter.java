package estrutural.adapter.adapters;

import estrutural.adapter.mercadopago.PayPago;
import estrutural.adapter.paypal.IPayPalPayments;
import estrutural.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;
    private PayPago payPago;

    public MercadoPagoAdapter(PayPago payPago) {
        this.payPago = payPago;
        System.out.println("Adaptando o PayPago utilizando os métodos padrões do PayPal.");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payPago.paypagoPayment();

    }

    @Override
    public void paypalReceive() {
        this.payPago.paypagoReceive();
    }
}

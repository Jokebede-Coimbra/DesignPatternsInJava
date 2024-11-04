package estrutural.adapter.mercadopago;

import estrutural.adapter.utils.Token;

public interface IPayPagoPayments {
    Token authToken();

    void paypagoPayment();

    void paypagoReceive();
}

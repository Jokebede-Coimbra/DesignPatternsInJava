package estrutural.adapter.paypal;

import estrutural.adapter.utils.Token;

public interface IPayPalPayments {

    Token authToken();

    void paypalPayment();

    void paypalReceive();
}

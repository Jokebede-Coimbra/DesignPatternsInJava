package estrutural.adapter.payoneer;

import estrutural.adapter.utils.Token;

public interface IPayoneerPayments {

    Token authToken();

    void sendPayment();

    void receivePayment();
}

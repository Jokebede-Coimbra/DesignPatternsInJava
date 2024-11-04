package estrutural.adapter;

import estrutural.adapter.adapters.PayoneerAdapter;
import estrutural.adapter.payoneer.Payoneer;
import estrutural.adapter.paypal.IPayPalPayments;
import estrutural.adapter.paypal.PayPal;

public class Main {
    public static void main(String[] args) {
        IPayPalPayments payPayments = new PayPal();
        payPayments.paypalPayment();
        payPayments.paypalReceive();

        // IPayPalPayments payPayments = new Payoneer();

        IPayPalPayments payments = new PayoneerAdapter(new Payoneer());
        payments.paypalPayment();
        payments.paypalReceive();
    }
}

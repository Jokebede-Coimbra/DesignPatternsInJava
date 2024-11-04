package estrutural.adapter;

import estrutural.adapter.adapters.MercadoPagoAdapter;
import estrutural.adapter.adapters.PaymentAdapterFactory;
import estrutural.adapter.adapters.PayoneerAdapter;
import estrutural.adapter.mercadopago.PayPago;
import estrutural.adapter.payoneer.Payoneer;
import estrutural.adapter.paypal.IPayPalPayments;
import estrutural.adapter.paypal.PayPal;

public class Main {
    public static void main(String[] args) {
//        IPayPalPayments payPayments = new PayPal();
//        payPayments.paypalPayment();
//        payPayments.paypalReceive();
//
//        // IPayPalPayments payPayments = new Payoneer();
//
//        IPayPalPayments payments = new PayoneerAdapter(new Payoneer());
//        payments.paypalPayment();
//        payments.paypalReceive();
//
//        // IPayPalPayments pagoPayments  = new PayPago();
//
//        IPayPalPayments pagoPayments = new MercadoPagoAdapter(new PayPago());
//        pagoPayments.paypalPayment();
//        pagoPayments.paypalReceive();
//
        String provider = "payoneer";

        IPayPalPayments payments = PaymentAdapterFactory.createAdapter(provider);

        payments.paypalPayment();
        payments.paypalReceive();
    }
}

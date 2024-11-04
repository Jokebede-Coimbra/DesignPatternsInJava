package estrutural.adapter.adapters;

import estrutural.adapter.mercadopago.PayPago;
import estrutural.adapter.payoneer.Payoneer;
import estrutural.adapter.paypal.IPayPalPayments;
import estrutural.adapter.paypal.PayPal;

public class PaymentAdapterFactory {

    public static IPayPalPayments createAdapter(String provider) {
        return switch (provider.toLowerCase()) {
            case "paypal" -> new PayPal(); // Classe concreta do PayPal que implementa IPayPalPayments
            case "payoneer" -> new PayoneerAdapter(new Payoneer()); // Adaptador para Payoneer
            case "mercadopago" -> new MercadoPagoAdapter(new PayPago()); // Adaptador para MercadoPago
            default -> throw new IllegalArgumentException("Provedor de pagamento não suportado: " + provider);
        };

    }
}

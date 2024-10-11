package solid.lsp;

public class MainPayment {
    public static void main(String[] args) throws Exception {

//        CreditCard creditCard = new CreditCard();
//        DebitCard debitCard = new DebitCard();
        NubankRewards nubankRewards = new NubankRewards();

        nubankRewards.validate();
        nubankRewards.collectPayment();
    }
}

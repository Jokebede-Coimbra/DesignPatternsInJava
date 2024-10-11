package solid.lsp;

public class NubankRewards implements IPaymentInstrument {

    @Override
    public void validate() throws Exception {
        System.out.println("Limite Ok, Rewards Ok!");
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagemento realizado com sucesso!");
        System.out.println("Pontuação  creditada no programa rewards!");
    }
}

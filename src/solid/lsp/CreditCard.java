package solid.lsp;

public class CreditCard extends NubankCard{

    @Override
    public void validate() throws Exception {

        System.out.println("Validando limite!");
        System.out.println("Limite Ok!");
    }
}

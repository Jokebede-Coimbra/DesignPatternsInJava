package estrutural.bridge.platforms;

public class DisneyPlus implements IPlatform{

    public DisneyPlus() {
        configureRMTP();
        System.out.println("Configuração de plataforma iniciada: DisneyPlus ");
    }

    @Override
    public void configureRMTP() {
        System.out.println("DisneyPlus: Conta autorizada. ");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: Autorizando aplicação.. ");
    }
}

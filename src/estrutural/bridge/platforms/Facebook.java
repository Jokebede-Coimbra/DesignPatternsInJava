package estrutural.bridge.platforms;

public class Facebook implements IPlatform {

    public Facebook() {
        configureRMTP();
        System.out.println("Configuração de plataforma iniciada: Facebook ");
    }

    @Override
    public void configureRMTP() {
        System.out.println("Facebook: Conta autorizada. ");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicação.. ");
    }
}

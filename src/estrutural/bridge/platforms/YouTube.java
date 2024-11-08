package estrutural.bridge.platforms;

public class YouTube implements IPlatform {

    public YouTube() {
        configureRMTP();
        System.out.println("Configuração de plataforma iniciada: YouTube");
    }

    @Override
    public void configureRMTP() {
        System.out.println("YouTube: Configurando broadcasting. ");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplicação.. ");
    }
}

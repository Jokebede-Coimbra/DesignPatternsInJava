package estrutural.bridge.platforms;

public class TwitchTV implements IPlatform {

    public TwitchTV() {
        configureRMTP();
        System.out.println("Configuração de plataforma iniciada: TwitchTV");
    }

    @Override
    public void configureRMTP() {
        System.out.println("TwitchTV: Configurando RMTP. ");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Validando o Canal.. ");
    }
}

package criacional.abstractfactory;

import criacional.abstractfactory.app.Application;
import criacional.abstractfactory.factories.ITransportFactory;
import criacional.abstractfactory.factories.NineNineTransport;
import criacional.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory;

        String company = "uber";

        if (company == "99") {
            factory = new UberTransport();
        } else {
            factory = new NineNineTransport();
        }
        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.starRoute();
    }
}

package comportamental.chainofresponsibility;

import comportamental.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import comportamental.chainofresponsibility.middlewares.CkeckUserMiddleware;
import comportamental.chainofresponsibility.middlewares.Middleware;
import comportamental.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Server server;
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void init() {
        server = new Server();
        server.registerUser("jkbd@coimbra.com.br", "8885!#bghk");
        server.registerUser("samarah@coimbra.com.br", "123");

        Middleware middleware = new CkeckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean done;
        do {
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite sua senha: ");
            String password = reader.readLine();
            done = server.logIn(email, password);
        } while (!done);
    }
}

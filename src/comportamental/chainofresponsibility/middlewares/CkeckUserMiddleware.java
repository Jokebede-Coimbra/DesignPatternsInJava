package comportamental.chainofresponsibility.middlewares;

import comportamental.chainofresponsibility.server.Server;

public class CkeckUserMiddleware extends Middleware {
    private Server server;

    public CkeckUserMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("E-mail Inválido");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("E-mail ou Senha Inválidos");
            return false;
        }
        return checkNext(email, password);
    }
}

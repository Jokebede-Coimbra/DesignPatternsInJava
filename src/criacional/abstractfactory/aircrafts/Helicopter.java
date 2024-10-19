package criacional.abstractfactory.aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Inciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageios ok, Ligando hélices.");
    }

    @Override
    public void wind() {
        System.out.println("ventos 25km, Suldeste, Ventos ok!");
    }
}

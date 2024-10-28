package criacional.abstractfactory.boats;

public class Boat implements IBoatVehicle {

    @Override
    public void startRoute() {
        checkWeather();
        getCargo();
        System.out.println("Iniciando a navegação.");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros e carga a bordo, prontos para zarpar!");
    }

    @Override
    public void checkWeather() {
        System.out.println("Condições climáticas favoráveis, estamos prontos para navegar!");
    }

}

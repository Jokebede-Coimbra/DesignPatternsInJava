package criacional.vehicles;

public class Motorcycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inciando a entrega.");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda.");
    }
}

package criacional;

import criacional.vehicles.Car;
import criacional.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}

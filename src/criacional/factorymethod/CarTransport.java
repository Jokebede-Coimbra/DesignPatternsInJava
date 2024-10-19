package criacional.factorymethod;

import criacional.factorymethod.vehicles.Car;
import criacional.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}

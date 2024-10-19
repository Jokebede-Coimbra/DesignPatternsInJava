package criacional.factorymethod;

import criacional.factorymethod.vehicles.Bike;
import criacional.factorymethod.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}

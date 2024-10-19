package criacional.factorymethod;

import criacional.factorymethod.Transport;
import criacional.factorymethod.vehicles.IVehicle;
import criacional.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}

package criacional;

import criacional.vehicles.IVehicle;
import criacional.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{

    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}

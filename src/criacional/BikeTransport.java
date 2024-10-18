package criacional;

import criacional.vehicles.Bike;
import criacional.vehicles.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}

package criacional.abstractfactory.factories;

import criacional.abstractfactory.aircrafts.Helicopter;
import criacional.abstractfactory.aircrafts.IAircraft;
import criacional.abstractfactory.landvehicles.ILandVehicle;
import criacional.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}

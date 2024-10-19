package criacional.abstractfactory.factories;

import criacional.abstractfactory.aircrafts.Airplane;
import criacional.abstractfactory.aircrafts.IAircraft;
import criacional.abstractfactory.landvehicles.Car;
import criacional.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}

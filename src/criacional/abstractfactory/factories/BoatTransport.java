package criacional.abstractfactory.factories;

import criacional.abstractfactory.aircrafts.IAircraft;
import criacional.abstractfactory.boats.Boat;
import criacional.abstractfactory.boats.IBoatVehicle;
import criacional.abstractfactory.landvehicles.ILandVehicle;

public class BoatTransport implements ITransportFactory {

    @Override
    public IBoatVehicle createTransportBoat() {
        return new Boat();
    }

    @Override
    public ILandVehicle createTransportVehicle() {
        return null;
    }

    @Override
    public IAircraft createTransportAircraft() {
        return null;
    }
}

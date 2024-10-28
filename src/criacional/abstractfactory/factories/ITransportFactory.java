package criacional.abstractfactory.factories;

import criacional.abstractfactory.aircrafts.IAircraft;
import criacional.abstractfactory.boats.IBoatVehicle;
import criacional.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoatVehicle createTransportBoat();
}

package criacional.abstractfactory.factories;

import criacional.abstractfactory.boats.IBoatVehicle;

public interface IWaterTransportFactory {
    IBoatVehicle createTransportBoat();

}

package criacional.abstractfactory.app;

import criacional.abstractfactory.aircrafts.IAircraft;
import criacional.abstractfactory.boats.IBoatVehicle;
import criacional.abstractfactory.factories.ITransportFactory;
import criacional.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private IBoatVehicle boat;


    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        boat = factory.createTransportBoat();
    }

    public void startRoute() {
        if (vehicle != null) vehicle.startRoute();
        if (aircraft != null) aircraft.startRoute();
        if (boat != null) boat.startRoute();
    }


}

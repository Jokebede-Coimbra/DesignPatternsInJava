package criacional.abstractfactory.app;

import criacional.abstractfactory.aircrafts.IAircraft;
import criacional.abstractfactory.factories.ITransportFactory;
import criacional.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
       vehicle = factory.createTransportVehicle();
       aircraft = factory.createTransportAircraft();
    }

    public void starRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }


}

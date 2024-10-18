package criacional;

import criacional.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {

        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}

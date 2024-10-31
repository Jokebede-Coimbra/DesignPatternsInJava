package criacional.builder.director;

import criacional.builder.builders.IBuilder;
import criacional.builder.builders.ISportBuilder;
import criacional.builder.components.CarType;
import criacional.builder.components.ColorType;
import criacional.builder.components.Engine;
import criacional.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructSTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportColor(ISportBuilder sportBuilder) {
        sportBuilder.setCarType(CarType.SPORTCAR);
        sportBuilder.setSeats(2);
        sportBuilder.setEngine(new Engine(4000));
        sportBuilder.setColor(ColorType.YELLOW);
    }
}

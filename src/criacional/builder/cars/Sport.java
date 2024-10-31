package criacional.builder.cars;

import criacional.builder.components.CarType;
import criacional.builder.components.ColorType;
import criacional.builder.components.Engine;
import criacional.builder.components.Transmission;

public class Sport {


    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final ColorType colorType;


    public Sport(CarType carType, int seats, Engine engine, Transmission transmission, ColorType colorType) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.colorType = colorType;
    }

    public String result() {
        String sport = "Color: " + colorType + "\n";
        sport += "Porsche with motor: " + engine.getPower();
        return sport;
    }
}

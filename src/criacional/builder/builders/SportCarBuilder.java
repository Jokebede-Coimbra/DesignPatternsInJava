package criacional.builder.builders;

import criacional.builder.cars.Sport;
import criacional.builder.components.CarType;
import criacional.builder.components.ColorType;
import criacional.builder.components.Engine;
import criacional.builder.components.Transmission;

public class SportCarBuilder implements ISportBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private ColorType colorType;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(ColorType colorType) {
      this.colorType = colorType;
    }

    public Sport getResult() {
        return new Sport(carType, seats, engine, transmission, colorType);
    }
}

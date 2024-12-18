package criacional.builder.builders;

import criacional.builder.cars.Car;
import criacional.builder.components.CarType;
import criacional.builder.components.ColorType;
import criacional.builder.components.Engine;
import criacional.builder.components.Transmission;

public class CarBuilder implements IBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

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


    public Car getResult() {
        return new Car (carType, seats, engine, transmission);
    }
}

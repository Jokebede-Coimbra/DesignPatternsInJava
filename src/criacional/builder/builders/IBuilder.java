package criacional.builder.builders;

import criacional.builder.components.CarType;
import criacional.builder.components.Engine;
import criacional.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType carType);

    void setSeats(int seats);

    void setTransmission(Transmission transmission);

    void setEngine(Engine engine);

}

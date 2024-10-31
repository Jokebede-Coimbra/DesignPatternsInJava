package criacional.builder;

import criacional.builder.builders.CarBuilder;
import criacional.builder.builders.SportCarBuilder;
import criacional.builder.builders.TruckBuilder;
import criacional.builder.cars.Car;
import criacional.builder.cars.Sport;
import criacional.builder.cars.Truck;
import criacional.builder.director.Director;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        System.out.println("======================CARRO=============================");
        // criando o carro
        CarBuilder carBuilder = new CarBuilder();
        director.constructSedanCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");
        System.out.println("======================CAMINHÃO==========================");
        // criando o caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructSTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhão: " + truck.result());
        System.out.println("======================CARRO*ESPORTIVO===================");
        SportCarBuilder sportCarBuilder =  new SportCarBuilder();
        director.constructSportColor(sportCarBuilder);

        Sport sport = sportCarBuilder.getResult();
        System.out.println("Carro: " + sport.result());
    }
}

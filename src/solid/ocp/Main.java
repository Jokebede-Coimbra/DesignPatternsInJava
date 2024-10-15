package solid.ocp;

import solid.isp.exemplo1.vehicles.Car;

public class Main {
    private static String type;

    public static void main(String[] args) {

//        typeVehicle = TypeVehicle.CAR;
//
//        if (typeVehicle == TypeVehicle.CAR) {
//            Car car = new Car("Preto", "2024", 2.6, 4);
//
//        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
//            Motorcycle motorcycle = new Motorcycle("Vermelho", "2024", 250);
//
//        }

        type = "CAR";

        Car car = new Car("Preto", "2024", 2.6, 4);

    }
}

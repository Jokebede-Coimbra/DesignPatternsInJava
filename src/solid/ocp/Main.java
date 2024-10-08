package solid.ocp;

import solid.ocp.enums.TypeVehicle;
import solid.ocp.vehicles2.Car;
import solid.ocp.vehicles2.Motorcycle;

public class Main {
    private static TypeVehicle typeVehicle;

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
    
        typeVehicle = TypeVehicle.CAR;

        Car car = new Car("Preto", "2024", 2.6, 4);

    }
}

package Main;

import Factories.VehicleProducer;
import Interfaces.IBus;
import Interfaces.ICar;
//import Interfaces.VehicleFactory;

public class VehicleDemo {

    private static final String CAR = "Car";
    private static final String BUS = "Bus";

    public static void main(String[] args) {

        ((ICar) VehicleProducer.getVehicleFactory(CAR).getModel("Rolls Royce")).displayVehicle();
        ((ICar) VehicleProducer.getVehicleFactory(CAR).getModel("Benz")).displayVehicle();
        ((ICar) VehicleProducer.getVehicleFactory(CAR).getModel("BMW")).displayVehicle();

        ((IBus) VehicleProducer.getVehicleFactory(BUS).getModel("Volvo")).displayVehicle();
        ((IBus) VehicleProducer.getVehicleFactory(BUS).getModel("Fuso")).displayVehicle();
        ((IBus) VehicleProducer.getVehicleFactory(BUS).getModel("TATA")).displayVehicle();

    }

}

package Factories;

import Interfaces.VehicleFactory;

public class VehicleProducer {

    public static VehicleFactory getVehicleFactory(String choice) {

        if (choice.equalsIgnoreCase("Car")) {
            return CarFactory.getInstance();

        } else if (choice.equalsIgnoreCase("Bus")) {
            return BusFactory.getInstance();
        }

        return null;

    }

}

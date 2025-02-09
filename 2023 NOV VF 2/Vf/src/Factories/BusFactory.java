package Factories;

import Interfaces.IBus;
import Interfaces.VehicleFactory;
import models.Fuso;
import models.TATA;
import models.Volvo;

public class BusFactory implements VehicleFactory {

    private static BusFactory instance;

    private BusFactory() {
    };

    public static BusFactory getInstance() {
        if (instance == null) {
            instance = new BusFactory();
        }
        return instance;
    }

    @Override
    public IBus getModel(String Vehicle) {

        if (Vehicle.equalsIgnoreCase("Volvo")) {
            return Volvo.getInstance();

        } else if (Vehicle.equalsIgnoreCase("Fuso")) {
            return Fuso.getInstance();

        } else if (Vehicle.equalsIgnoreCase("TATA")) {
            return TATA.getInstance();
        }

        return null;

    }

}

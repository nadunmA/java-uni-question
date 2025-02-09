package Factories;

import Interfaces.ICar;
import Interfaces.VehicleFactory;
import models.BMW;
import models.Benz;
import models.RollsRoys;

public class CarFactory implements VehicleFactory {

    private static CarFactory instance;

    private CarFactory() {
    };

    public static CarFactory getInstance() {

        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;

    }

    @Override
    public ICar getModel(String Vehicle) {

        if (Vehicle.equalsIgnoreCase("BMW")) {
            return BMW.getInstance();

        } else if (Vehicle.equalsIgnoreCase("Benz")) {
            return Benz.getInstance();

        } else if (Vehicle.equalsIgnoreCase("Rolls Royce")) {
            return RollsRoys.getInstance();

        }

        return null;

    }

}

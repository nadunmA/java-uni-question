package models;

import Interfaces.ICar;

public class BMW implements ICar {

    private static BMW instance;

    private BMW() {
    };

    public static BMW getInstance() {

        if (instance == null) {
            instance = new BMW();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {

        System.out.println("BMW Car Creatrd");
    }

}

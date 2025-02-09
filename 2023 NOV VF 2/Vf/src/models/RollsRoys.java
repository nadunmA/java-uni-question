package models;

import Interfaces.ICar;

public class RollsRoys implements ICar {

    private static RollsRoys instance;

    private RollsRoys() {
    };

    public static RollsRoys getInstance() {

        if (instance == null) {
            instance = new RollsRoys();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {
        System.out.println("Rolls Royce Car Created");
    }

}

package models;

import Interfaces.IBus;

public class TATA implements IBus {

    private static TATA instance;

    private TATA() {
    };

    public static TATA getInstance() {

        if (instance == null) {
            instance = new TATA();
        }
        return instance;
    }

    @Override
    public void displayVehicle() {

        System.out.println("TATA Bus Creatrd");
    }

}

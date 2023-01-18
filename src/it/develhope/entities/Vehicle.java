package it.develhope.entities;

public abstract class Vehicle {
    public String type;
    public int numberOfWheels;

    public void showVehicleDetails(){
        System.out.println("Vehicle: " + type +" -Wheels: "+ numberOfWheels);
    }

    public abstract void doVehicleSound();

}

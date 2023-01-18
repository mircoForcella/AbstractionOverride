package it.develhope.entities;

public class Car extends Vehicle {

    private int numberOfDoors;
    private double carPrice;

    @Override
    public void doVehicleSound() {
        System.out.println("brum brum");
    }

    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Doors car: " + numberOfDoors);
    }

    public Car(int numberOfWheels, int numberOfDoors, int carPrice){
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
        this.carPrice = carPrice;
        this.type = "Car";
    }
}

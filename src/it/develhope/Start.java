package it.develhope;

import it.develhope.entities.Boat;
import it.develhope.entities.Car;

public class Start {
    public static void main(String[] args) {
        Car car = new Car(4,5,10000);
        Boat boat = new Boat(50,2000);

        car.doVehicleSound();
        car.showVehicleDetails();

        System.out.println("---------------------");
        
        boat.doVehicleSound();
        boat.showVehicleDetails();
        boat.getBoatWeightAndSpeed();
    }
}

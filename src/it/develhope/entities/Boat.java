package it.develhope.entities;

public class Boat extends Vehicle {
    public double maxKnotsSpeed;
    public int boatKilosWeight;

    @Override
    public void doVehicleSound() {
        System.out.println("rumore della barca");
    }

    public Boat(double maxKnotsSpeed, int boatKilosWeight){
        this.type = "Boat";
        this.maxKnotsSpeed = maxKnotsSpeed;
        this.boatKilosWeight = boatKilosWeight;
    }

    public void getBoatWeightAndSpeed(){
        System.out.println("Weight: "+ boatKilosWeight+ " kg, Max speed: "+ maxKnotsSpeed+ " in knots");
    }
}

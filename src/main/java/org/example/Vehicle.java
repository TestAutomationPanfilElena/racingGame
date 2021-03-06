package org.example;

public class Vehicle {

    public static final String CONTROL_TYPE = "Radio Control ";

   private String name;
    private String color;
    private int WheelCount;
    private double currentSpeed;
    private double mileage;
    private double fuelLevel;



    public double accelerate (double speed){
        if (fuelLevel > 0) {

        setCurrentSpeed (getCurrentSpeed () + speed);

          double traveledDistance =getCurrentSpeed () /60;

          double spentFuel = traveledDistance * mileage/100;

          fuelLevel -= spentFuel;

          return traveledDistance;

          }else{
            System.out.println ("Vehicle" + name +"is out of fuel!");
        return  0;

        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelCount() {
        return WheelCount;
    }

    public void setWheelCount(int wheelCount) {
        WheelCount = wheelCount;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", WheelCount=" + WheelCount +
                '}';
    }

}

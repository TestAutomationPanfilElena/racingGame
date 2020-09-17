package org.example;

public class RadioControlledMotorcycle extends AutoVehicle{

    private int  doorCount;

    public RadioControlledMotorcycle(Engine engine) {
        super (engine);
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }
}

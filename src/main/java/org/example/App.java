package org.example;

import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {


      /*  Engine daciaEngine = new Engine ();
        daciaEngine.setManufacturer ("Renault");

        RadioControlledCar dacia = new RadioControlledCar (daciaEngine);

        dacia.setName ("Dacia");
        dacia.setColor ("red");
        dacia.setDoorCount (4);
        dacia.setWheelCount (4);
        dacia.setMileage (8.5);


        //  dacia.engine = daciaEngine;
        Engine ladaEngine = new Engine ();
        ladaEngine.setManufacturer ("Lada");

        RadioControlledCar lada = new RadioControlledCar (ladaEngine);
        lada.setName ("lada");
        lada.setColor ("blue");
        lada.setDoorCount (2);
        lada.setWheelCount (4);
        lada.setMileage (8);


        //  lada.engine = ladaEngine;
        RadioControlledCar motorcycle = new RadioControlledCar (new Engine ());


        Race race = new Race ();

        race.getCompetitors ().add (dacia);
        race.getCompetitors ().add (lada);




        for (Vehicle vehicle : race.getCompetitors ()) {
            if (vehicle != null) {
                System.out.println (vehicle.getName ());
            }

        }

     race.readVehicleName ();
        race.readAccelerationSpeed ();*/

        Race race = new Race ();
        race.setTrackLength (200);
        race.setTrackFuelLevel (50);
        race.start ();
    }
}
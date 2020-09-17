package org.example;

public class AutoVehicle extends Vehicle{

    private Engine engine ;


    public AutoVehicle(Engine engine) {
        this.engine = engine;

    }
    public AutoVehicle(){
        this(new Engine ());
    }

    public AutoVehicle(Engine engine,String name){
        this(engine);
        setName (name);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}

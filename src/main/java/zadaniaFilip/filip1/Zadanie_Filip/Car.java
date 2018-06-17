package zadaniaFilip.filip1.Zadanie_Filip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Car implements IVehicle {

//    komponenty auta
    @Autowired
    Engine engine;
    RadioPlayer radioplayer;
    SteeringWheel steeringwheel;

    public Car(Engine engine, RadioPlayer radioplayer, SteeringWheel steeringwheel) {
        this.engine = engine;
        this.radioplayer = radioplayer;
        this.steeringwheel = steeringwheel;
    }

    @Override
    public void Drive() {
        System.out.println("\n Auto jezdzi \n");
        engine.makeNoise();
    }
}





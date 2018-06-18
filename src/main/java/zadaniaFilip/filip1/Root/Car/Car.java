package zadaniaFilip.filip1.Root.Car;

import org.springframework.beans.factory.annotation.Autowired;


public class Car {

//    komponenty auta
    Engine engine;
    RadioPlayer radioplayer;
    SteeringWheel steeringwheel;

    //konstruktor
    public Car(Engine engine, RadioPlayer radioplayer, SteeringWheel steeringwheel) {
        this.engine = engine;
        this.radioplayer = radioplayer;
        this.steeringwheel = steeringwheel;
    }


}





package zadaniaFilip.filip1.Root.Car;

import org.springframework.data.annotation.Id;


public class Car {

//    komponenty auta
    @Id
    private String id;
    private Engine engine;
    private RadioPlayer radioplayer;
    private SteeringWheel steeringwheel;


    //konstruktor
    public Car( Engine engine, RadioPlayer radioplayer, SteeringWheel steeringwheel) {
        this.engine = engine;
        this.radioplayer = radioplayer;
        this.steeringwheel = steeringwheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public RadioPlayer getRadioplayer() {
        return radioplayer;
    }

    public void setRadioplayer(RadioPlayer radioplayer) {
        this.radioplayer = radioplayer;
    }

    public SteeringWheel getSteeringwheel() {
        return steeringwheel;
    }

    public void setSteeringwheel(SteeringWheel steeringwheel) {
        this.steeringwheel = steeringwheel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}





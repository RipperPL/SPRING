package zadaniaFilip.filip1.Root.model;


public class Engine  {

    private int power;

    //konstruktor
    public Engine(int power) {
        this.power= power;
    }
    public Engine(){}

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

package zadaniaFilip.filip1.Zadanie_Filip;

import org.springframework.stereotype.Component;


public class Engine extends CarComponent {

    private int power;

    public Engine(int power) {
        this.power= power;
        super.price=power*100;
        super.guarantee=power/20;

    }
    public void makeNoise() {
        System.out.print("Odgglos silnika");
    }
}

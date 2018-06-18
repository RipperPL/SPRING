package zadaniaFilip.filip1.Root;

import org.springframework.beans.factory.annotation.Autowired;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Service.CarService;

import java.util.Scanner;

public class CarOwner {

    private String imie;
    private Car vehicle;
    String songToPlay;
    @Autowired
    CarService carService;

    public CarOwner(Car vehicle, String imie) {
        this.vehicle = vehicle;
        this.imie=imie;
    }

    public void playMusic(String songToPlayName){
//        TO JEST BEZ SENSU ALE NIE MIALEM INNEGO POMYSLU - MUSZE WYWOLAC teraz CarService - ale on jest beanem ? ?
//        CarService carService = new CarService();
//          Dlatego robię @Autowired w linii 14
//          wywala blad Nullpointerexception
        carService.playMusic(songToPlayName);


    }
}


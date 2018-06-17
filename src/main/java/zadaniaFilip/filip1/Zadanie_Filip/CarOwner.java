package zadaniaFilip.filip1.Zadanie_Filip;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class CarOwner implements IUser{

    private String imie;
    private String dbUser;
    private String dbPassword;
    @Autowired
    IVehicle vehicle;
    @Autowired
    RadioPlayer radio;
    @Autowired
    Logowanie logowanie;


    public void BuyCar() {
        System.out.println("\n Samochod kupiony \n");
    }

    public void Drive(IVehicle vehicle) {
        vehicle.Drive();
    }

    public void TurnTheRadioOn(){

        if (logowanie.EnterCredentials()==1){
            radio.playMusic();
        }
        else
        {
            //fail
        }
        System.out.println("\n Radio wlaczone \n");

    }

}

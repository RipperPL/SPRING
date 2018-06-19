package zadaniaFilip.filip1.Root.Service;

import org.springframework.beans.factory.annotation.Autowired;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Repository.Kompozycja;
import zadaniaFilip.filip1.Root.Repository.CarRepository;
import zadaniaFilip.filip1.Root.music;

public class CarService {

    @Autowired
    CarRepository carRepository;


public void playMusic(String songToPlay){

        try {
            songExistsCheck(songToPlay);
            //sprawdzenie czy piosenka istnieje w bazie
            //

        }
        catch (Exception e){}
    }

    private void songExistsCheck(String songToPlayName){

        carRepository.getData(songToPlayName);
    }

    public void addDataTodatabase (Car car){

    music songToAdd = new music();
    songToAdd.setLength("120");
    songToAdd.setAuthor("Queen");
    songToAdd.setName("II");

    createList(car, songToAdd );
    Kompozycja listKompozycja= new Kompozycja(car, songToAdd);

    carRepository.enterData(listKompozycja);

}


private void createList(Car car, music songToAdd){



}



}

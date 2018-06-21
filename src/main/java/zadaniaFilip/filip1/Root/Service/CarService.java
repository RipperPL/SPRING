package zadaniaFilip.filip1.Root.Service;

import org.springframework.beans.factory.annotation.Autowired;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Repository.CarRepository;
import zadaniaFilip.filip1.Root.Car.Song;

import java.util.ArrayList;

public class CarService {

    @Autowired
    CarRepository carRepository;

    //create new car record in db
    public void addToDatabase(Car carToBeAdded) {
     carRepository.addRecordCar(carToBeAdded);
    }
    //ad song to database
    public void addToDatabase (Car car, Song songToBeAdded) {

        try {
            //check if the provided car exists in database
            carRepository.checkRecord(car);
            //add song to DB
            carRepository.addRecordSong(car, songToBeAdded);
        } catch (Exception e) {
        }
    }
    //remove song from DB
    public void removeFromDB (Car car, Song song){
            carRepository.deleteRecordSong(car, song);
        }
    // remove car from DB
        public void removeFromDB (Car car){
            carRepository.deleteRecordCar(car);
        }

    }




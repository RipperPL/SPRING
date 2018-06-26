package zadaniaFilip.filip1.Root.Service;

import org.springframework.beans.factory.annotation.Autowired;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Repository.CarRepository;
import zadaniaFilip.filip1.Root.Car.Song;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

public class CarService {

    @Autowired
    CarRepository carRepository;

    //add Car record to DB
    public void addToDatabase(Car carToBeAdded) {
        carRepository.addRecordCar(carToBeAdded);
    }

    //ad song to database
    public void addToDatabase(String carID, Song songToBeAdded) {

        //check if the provided car exists in database

        if ( getCar(carID)!= null) {
            //add song to DB
            carRepository.addRecordSong(carID, songToBeAdded);
        }
    }

    //remove song from DB
    public void removeFromDB(Car car, Song song) {
        carRepository.deleteRecordSong(car, song);
    }

    // remove car from DB
    public void removeFromDB(Car car) {
        carRepository.deleteRecordCar(car);
    }


    public List<Car> getAllCars(){
        List<Car> listOfCars = new ArrayList<Car>();
             listOfCars= carRepository.getRecord();
        return listOfCars;
    }

    public Car getCar(String carID){
        Car foundCar= carRepository.getRecord(carID);
        return foundCar;
    }


}


package zadaniaFilip.filip1.Root.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zadaniaFilip.filip1.Root.Car.*;
import zadaniaFilip.filip1.Root.Service.CarService;
import java.util.LinkedList;
import java.util.List;

@RestController
public class CarController {
@Autowired
CarService carService;

    @GetMapping("/getAll")
        public List<Car> getAll(){
        List<Car> listOfCars = new LinkedList<Car>();
        listOfCars= carService.getAllCars();
        return listOfCars;
        }

    @GetMapping("/getCar")
    public Car carGet(@RequestParam(value="id", defaultValue="5b2bad1b1654f11c80a6c2d2") String id) {
        Car foundCar = carService.getCar(id);
        return foundCar;
    }

    @PostMapping("/postCar/{enginePower}-{radioPlayerPrice}-{steeringWheelPrice}")
            public String postCar (
                    @PathVariable String enginePower,
                    @PathVariable String radioPlayerPrice,
                    @PathVariable String steeringWheelPrice
    ){

        Car BMW = new Car( new Engine(Integer.parseInt(enginePower)), new RadioPlayer(Integer.parseInt(radioPlayerPrice), null), new SteeringWheel(Integer.parseInt(steeringWheelPrice)));
        String carID = carService.addToDatabase(BMW);
        return carID;
    }

    @PostMapping("/postSong/{carID}/{songAuthor}-{songTitle}-{songDuration}")
            public void postSong(
                    @PathVariable String carID,
                    @PathVariable String songAuthor,
                    @PathVariable String songTitle,
                    @PathVariable String songDuration
    ){

            carService.addToDatabase(carID, new Song(songTitle, songAuthor, songDuration));
    }

    @DeleteMapping("/delete/{carID}")
            public void deleteCar (@PathVariable String carID){

        carService.removeFromDB(carID);
    }

    @DeleteMapping("/delete/{carID}/{songName}-{songAuthor}-{songLength}")
    public void deleteSong (@PathVariable String carID,
                            @PathVariable String songName,
                            @PathVariable String songAuthor,
                            @PathVariable String songLength){

        Song songToBeDeleted = new Song(songName, songAuthor, songLength);
        carService.removeFromDB(carID, songToBeDeleted);
    }
}



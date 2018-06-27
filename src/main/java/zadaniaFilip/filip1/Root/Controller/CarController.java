package zadaniaFilip.filip1.Root.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zadaniaFilip.filip1.Root.Car.*;
import zadaniaFilip.filip1.Root.Service.CarService;

import java.util.List;

@RestController
@Api(description = "Najbardziej zajebiste API ever", produces = "application/json", tags = {"Database Connector "})
public class CarController {
    @Autowired
    CarService carService;

    @ApiOperation("Get all Cars from Database")
    @GetMapping("/getAll")
    public List<Car> getAll() {
        return carService.findAll();
    }


    @ApiOperation("Get a single car from Database")
    @GetMapping("/getCar")
    public Car carGet(@RequestParam(value = "id", defaultValue = "5b2bad1b1654f11c80a6c2d2") String id) {
        Car foundCar = carService.findbyId(id);
        return foundCar;
    }

    //}
//
    @ApiOperation("Create a cer and post it to repository")
    @PostMapping("/postCar/{enginePower}-{radioPlayerPrice}-{steeringWheelPrice}")
    public String postCar(
            @PathVariable String enginePower,
            @PathVariable String radioPlayerPrice,
            @PathVariable String steeringWheelPrice
    ) {

        Car BMW = new Car(new Engine(Integer.parseInt(enginePower)), new RadioPlayer(Integer.parseInt(radioPlayerPrice), null), new SteeringWheel(Integer.parseInt(steeringWheelPrice)));
        String carID = carService.insert(BMW);
        return carID;
    }

    @ApiOperation(value = "Add a song to the chosen database ", notes = "Required to add more songs")
    @PostMapping("/postSong/{carID}/{songAuthor}-{songTitle}-{songDuration}")
    public void postSong(
            @PathVariable String carID,
            @PathVariable String songAuthor,
            @PathVariable String songTitle,
            @PathVariable String songDuration
    ) {

        carService.addSong(carID, new Song(songTitle, songAuthor, songDuration));
    }


    @ApiOperation(value = "Delete a chosen car from Database", notes = "Deleting the car")
    @DeleteMapping("/delete/{carID}")
    public void deleteCar(@PathVariable String carID) {

        carService.delete(carID);
    }


    @ApiOperation(value = "Delete a chosen song from a chosen Car", notes = "Provided that the car and song exist it is possible to delete a record")
    @DeleteMapping("/delete/{carID}/{songID}")
    public void deleteSong(@PathVariable String carID,
                           @PathVariable String songID){

        carService.deleteSong(carID, Integer.parseInt(songID));
    }
}


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
    public Car car(@RequestParam(value="id", defaultValue="5b2bad1b1654f11c80a6c2d2") String id) {
        Car foundCar= carService.getCar(id);
        return foundCar;
    }

}

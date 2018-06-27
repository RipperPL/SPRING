package zadaniaFilip.filip1.Root.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Car.Song;
import zadaniaFilip.filip1.Root.Repository.CarRepository;

import java.util.LinkedList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;


    public List<Car> findAll() {
        return carRepository.findAll();
    }

    public Car findbyId(String id) {

        return carRepository.findById(id).get();
    }

    public String insert(Car car) {
        carRepository.insert(car);
        return car.getId();
    }

    public Car addSong(String carID, Song song) {

        Car carToUpdate = this.findbyId(carID);
        if (carToUpdate.getRadioplayer().getPlayList()==null) {
            carToUpdate.getRadioplayer().setPlayList(new LinkedList<>());
        }
        song.setId(carToUpdate.getRadioplayer().getPlayList().size());
        carToUpdate.getRadioplayer().addSongToPlaylist(song);
        carRepository.save(carToUpdate);
        return carToUpdate;
    }

    public String delete(String carID) {
        Car carToDelete = this.findbyId(carID);
        carRepository.delete(carToDelete);
        return carToDelete.getId();
    }

    public Car deleteSong(String carID, int songID) {

        Car carToUpdate = this.findbyId(carID);
        carToUpdate.getRadioplayer().deleteSongFromPlaylist(songID);
        carRepository.save(carToUpdate);
        return carToUpdate;
    }

}
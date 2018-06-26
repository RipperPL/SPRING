package zadaniaFilip.filip1.Root.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Car.Song;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

public class CarRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    //    adding records to database
    public void addRecordCar(Car car) {
        mongoTemplate.insert(car);
    }

    //Existence-check - dB  for specific record
    public Car getRecord(String carID) {
        Car outputCar= mongoTemplate.findById(carID, Car.class);
        return outputCar;
    }

    public List<Car> getRecord()

    {
        List<Car> allCars = new ArrayList<Car>();

       allCars= mongoTemplate.findAll(Car.class);
       return allCars;
    }


    public void addRecordSong(String carID, Song song){

        Query query = new Query(where("id").is(carID));
        Update update = new Update().push("radioplayer.playList", song);
        mongoTemplate.updateFirst(query,update, Car.class);
    }

    public void deleteRecordSong (String carID, Song song){

        Query query = new Query(where("id").is(carID));
        Update update = new Update().pull("radioplayer.playList", song);
        mongoTemplate.updateFirst(query,update, Car.class);
    }

    public void deleteRecordCar( String carID){

        Query query = new Query(where("id").is(carID));
        mongoTemplate.remove(query,Car.class);
    }
}



//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient(), "test");
//        context.getBean(music.class);
//        Query query = new Query(where("author").is("Offspring"));
//        List<music> result = mongoTemplate.find(query, music.class);












package zadaniaFilip.filip1.Root.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Car.Song;


import java.util.ArrayList;

import static org.springframework.data.mongodb.core.query.Criteria.where;

public class CarRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    //    adding records to database
    public void addRecordCar(Car car) {
        mongoTemplate.insert(car);
    }

    //Existence-check - dB  for specific record
    public void checkRecord(Car car) {
        mongoTemplate.findById(car.getId(), Car.class);
    }
    public void addRecordSong(Car car, Song song){

        Query query = new Query(where("id").is(car.getId()));
        Update update = new Update().push("radioplayer.playList", song);
        mongoTemplate.updateFirst(query,update, Car.class);
    }

    public void deleteRecordSong (Car car, Song song){

        Query query = new Query(where("id").is(car.getId()));
        Update update = new Update().pull("radioplayer.playList", song);
        mongoTemplate.updateFirst(query,update, Car.class);
    }

    public void deleteRecordCar( Car car){
        mongoTemplate.remove(car);

    }
}


       //NIE KASUJ - stare a dziala
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient(), "test");
//        context.getBean(music.class);
//        Query query = new Query(where("author").is("Offspring"));
//        List<music> result = mongoTemplate.find(query, music.class);












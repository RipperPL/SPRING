package zadaniaFilip.filip1.Root.Repository;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import zadaniaFilip.filip1.Root.Config;
import zadaniaFilip.filip1.Root.SongToPlay;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

public class CarRepository {

    @Autowired
    MongoTemplate mongoTemplate;


   public void getData(String songToPlayName) {

       SongToPlay songToPlay = new SongToPlay();
       Query query = new Query(where("name").is(songToPlayName));
       List<SongToPlay> result = mongoTemplate.find(query, SongToPlay.class);

//NIE KASUJ - stare a dziala
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient(), "test");
//        context.getBean(music.class);
//        Query query = new Query(where("author").is("Offspring"));
//        List<music> result = mongoTemplate.find(query, music.class);

        System.out.println(" Wlasnie słuchasz " + result.get(0).getAuthor() + " " + result.get(0).getName() + " Utwór trwa " + Integer.parseInt(result.get(0).getLength()) / 60 + "min" + Integer.parseInt(result.get(0).getLength()) % 60 + "sek");

    }
    void modifyData(){
        //
    }
    void deleteData(){
        //
    }


}
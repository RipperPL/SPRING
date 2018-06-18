package zadaniaFilip.filip1.Root.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import zadaniaFilip.filip1.Root.music;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

public class CarRepository {

    @Autowired
    MongoTemplate mongoTemplate;


   public List<music> getData(String songToPlayName) {

       music songToPlay = new music();
       Query query = new Query(where("name").is(songToPlayName));
       List<music> result = mongoTemplate.find(query, music.class);



       //NIE KASUJ - stare a dziala
//        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient(), "test");
//        context.getBean(music.class);
//        Query query = new Query(where("author").is("Offspring"));
//        List<music> result = mongoTemplate.find(query, music.class);

        System.out.println(" Wlasnie słuchasz " + result.get(0).getAuthor() + " " + result.get(0).getName() + " Utwór trwa " + Integer.parseInt(result.get(0).getLength()) / 60 + "min" + Integer.parseInt(result.get(0).getLength()) % 60 + "sek");

        return result;
    }
    public void enterData(Kompozycja listKompozycja){

    mongoTemplate.insert(listKompozycja);

    }
    void deleteData(){
        //
    }


}
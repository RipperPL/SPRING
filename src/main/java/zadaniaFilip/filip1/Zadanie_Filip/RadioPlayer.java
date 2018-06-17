package zadaniaFilip.filip1.Zadanie_Filip;

import com.mongodb.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;


public class RadioPlayer extends CarComponent{

    private static final Log log = LogFactory.getLog(RadioPlayer.class);
    public RadioPlayer() {
    super.guarantee=1;
    super.price=350;
    }

    @Autowired
    music piosenka;

    void playMusic (){

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient(), "test");
        music songToPlay = context.getBean(music.class);
        Query query = new  Query(where("author").is("Metallica"));
        List<music> result = mongoTemplate.find(query, music.class);

        System.out.println(" Wlasnie słuchasz " +result.get(0).getAuthor() +" "+ result.get(0).getName()+ " Utwór trwa "+ Integer.parseInt(result.get(0).getLength())/60 +"min" +Integer.parseInt(result.get(0).getLength())%60 + "sek");

        int i=0;
        i++;


    }

}
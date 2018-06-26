package zadaniaFilip.filip1.Root;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.core.MongoTemplate;
import zadaniaFilip.filip1.Root.Repository.CarRepository;
import zadaniaFilip.filip1.Root.Service.CarService;

@PropertySource("classpath:application.properties")
@Configuration
public class Config {

    @Bean
    public MongoClient mongoClient(@Value("${database}") String host_add ) {

        return new MongoClient( host_add, 27017);
    }

     @Bean
    public MongoTemplate mongoTemplate(MongoClient mongoClient) {
        return new MongoTemplate(mongoClient, "test");
    }


    @Bean
    public CarRepository carPepository() { return new CarRepository(); }

    @Bean
    public CarService carService() { return new CarService(); }

}


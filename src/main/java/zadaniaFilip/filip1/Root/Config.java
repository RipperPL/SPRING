package zadaniaFilip.filip1.Root;


import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zadaniaFilip.filip1.Root.Repository.CarRepository;
import zadaniaFilip.filip1.Root.Service.CarService;


@Configuration
public class Config {

    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost", 27017);
    }

    @Bean
    public CarRepository carPepository() { return new CarRepository(); }

    @Bean
    public CarService carService() { return new CarService(); }

}
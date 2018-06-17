package zadaniaFilip.filip1.Zadanie_Filip;


import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
    //Klasy user
    @Bean
    SteeringWheel GetWheel() {
        return new SteeringWheel("Skóra", true);
    }

    @Bean
    Engine GetEngine() {
        return new Engine(10);
    }

    @Bean
    RadioPlayer getRadioPlayer() {
        return new RadioPlayer();
    }

    @Bean
    IVehicle getVehicle(Engine engine, RadioPlayer radioplayer, SteeringWheel steeringwheel) {
        return new Car(engine, radioplayer, steeringwheel);
    }

    //Beany dla danych dla MongoCredential - User
    @Bean
    CarOwner getOwner() {
        return new CarOwner();
    }
    @Bean
    Logowanie getLog() {
        return new Logowanie();
    }

    //Bean dla serwera
    @Bean
    public MongoClient mongoClient() {
        return new MongoClient("localhost", 27017);
    }



    @Bean
    public music returnSong() {
        return new music();

    }
}
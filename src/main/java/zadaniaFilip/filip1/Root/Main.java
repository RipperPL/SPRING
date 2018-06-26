package zadaniaFilip.filip1.Root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import zadaniaFilip.filip1.Root.Car.*;
import zadaniaFilip.filip1.Root.Service.CarService;

import java.util.LinkedList;


@SpringBootApplication
@ComponentScan
@EnableSwagger2
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CarService carService =context.getBean(CarService.class);

		LinkedList<Song> playlist = new LinkedList<Song>();
		playlist.add(new Song("Bet33terss", "Trupalica", "4323"));
		Car BMW = new Car( new Engine(10006), new RadioPlayer(2020, playlist), new SteeringWheel(2008));

		carService.addToDatabase(BMW);

		String carID= "5b2bad1b1654f11c80a6c2d2";

		carService.addToDatabase(carID, new Song("songaasd","Emil","99"));

	}

}




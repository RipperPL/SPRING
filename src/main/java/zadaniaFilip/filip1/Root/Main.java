package zadaniaFilip.filip1.Root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadaniaFilip.filip1.Root.Car.*;
import zadaniaFilip.filip1.Root.Service.CarService;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CarService carService =context.getBean(CarService.class);

		LinkedList<Song> playlist = new LinkedList<Song>();
		playlist.add(new Song("Bet33terss", "Trupalica", "4323"));

		Car BMW = new Car(new Engine(1000), new RadioPlayer(200, playlist), new SteeringWheel(200));


		carService.addToDatabase(BMW);
		carService.addToDatabase(BMW, new Song("songaasd","Emil","99"));

		carService.removeFromDB(BMW, new Song("songaasd","Emil","99"));
		carService.removeFromDB(BMW);

	}

}




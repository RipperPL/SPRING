package zadaniaFilip.filip1.Root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Car.Engine;
import zadaniaFilip.filip1.Root.Car.RadioPlayer;
import zadaniaFilip.filip1.Root.Car.SteeringWheel;
import zadaniaFilip.filip1.Root.Service.CarService;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	{

		Car BMW =new  Car(new Engine(100), new RadioPlayer(200), new SteeringWheel(200));

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


		String songToPlayName = "Nothing else matters";

		CarService carService =context.getBean(CarService.class);

		carService.playMusic(songToPlayName);

		carService.addDataTodatabase(BMW);



	}

}




package zadaniaFilip.filip1.Root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadaniaFilip.filip1.Root.Car.Car;
import zadaniaFilip.filip1.Root.Car.Engine;
import zadaniaFilip.filip1.Root.Car.RadioPlayer;
import zadaniaFilip.filip1.Root.Car.SteeringWheel;

import java.util.Scanner;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	{

		CarOwner carOwner= new CarOwner(new Car(new Engine(100), new RadioPlayer(200), new SteeringWheel(200)), "Emil");
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

	//	Scanner scan = new Scanner (System.in);
		String songToPlayName = "Nothing Else Matters";
				//scan.nextLine();
		carOwner.playMusic(songToPlayName);
	}

}




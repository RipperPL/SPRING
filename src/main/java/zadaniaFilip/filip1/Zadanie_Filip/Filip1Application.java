package zadaniaFilip.filip1.Zadanie_Filip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadaniaFilip.filip1.olejto.BMW;

@SpringBootApplication
public class Filip1Application {

	public static void main(String[] args) {
		SpringApplication.run(Filip1Application.class, args);
	}
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CarOwner Owner = context.getBean(CarOwner.class);
		Owner.BuyCar();
		Car BMW = context.getBean(Car.class);
		Owner.Drive(BMW);
		Owner.TurnTheRadioOn();
//TODO dorobic obsluge hasla i username
	}

}




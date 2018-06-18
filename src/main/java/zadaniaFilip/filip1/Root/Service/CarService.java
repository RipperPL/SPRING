package zadaniaFilip.filip1.Root.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadaniaFilip.filip1.Root.Config;
import zadaniaFilip.filip1.Root.Repository.CarRepository;
import zadaniaFilip.filip1.Root.SongToPlay;

public class CarService {

    @Autowired
    CarRepository carRepository;

public void playMusic(String songToPlay){

    try {
        songExistsCheck(songToPlay);
        //sprawdzenie czy piosenka istnieje w bazie
        //

    }
    catch (Exception e){}
}

private boolean songExistsCheck(String songToPlayName){

    carRepository.getData(songToPlayName);


    return true;
}


}

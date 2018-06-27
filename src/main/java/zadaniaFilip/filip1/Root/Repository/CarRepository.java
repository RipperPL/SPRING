package zadaniaFilip.filip1.Root.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zadaniaFilip.filip1.Root.Car.Car;

@Repository

public interface CarRepository extends MongoRepository<Car, String> {

}

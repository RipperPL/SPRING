package zadaniaFilip.filip1.Root.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zadaniaFilip.filip1.Root.model.Car;

@Repository
public interface CarRepository extends MongoRepository<Car, String> {

}

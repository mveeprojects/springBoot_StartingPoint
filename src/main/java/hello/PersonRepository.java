package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// automatically creates an endpoint at /people for you to hit
@RepositoryRestResource(path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {
}
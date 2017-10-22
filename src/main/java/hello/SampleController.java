package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SampleController {

    private List<Person> people;

    @Autowired
    private PersonRepository repository;

    @RequestMapping("/")
    public String home() throws IOException {
        return "Hello World!";
    }

    @RequestMapping("/readDBPersonObjects")
    private List<Person> readMongo() throws IOException {
        people = new ArrayList<>();

        for (Person person : repository.findAll()) {
            people.add(person);
        }
        return people;
    }

    @RequestMapping("/addPerson")
    public List<Person> addPerson(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) throws IOException {

        Person newPerson = new Person(firstName, lastName);
        repository.save(newPerson);
        return readMongo();
    }

    @RequestMapping("/deletePerson")
    public List<Person> deletePerson(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) throws IOException {

        for (Person person : repository.findAll()) {
            if(person.getFirstName().equals(firstName) && person.getLastName().equals(lastName)){
                repository.delete(person);
            }
        }
        return readMongo();
    }
}
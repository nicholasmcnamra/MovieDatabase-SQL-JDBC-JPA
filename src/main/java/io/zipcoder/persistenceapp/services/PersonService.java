package io.zipcoder.persistenceapp.services;

import io.zipcoder.persistenceapp.models.Person;
import io.zipcoder.persistenceapp.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PersonService {
    private PersonRepository repo;
    @Autowired
    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    //read
    public Person findById(long id) {
        return repo.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    public Iterable<Person> findAllPersons() {
        return repo.findAll();
    }

    //create
    public Person create(Person person) {
        return repo.save(person);
    }
    public Iterable<Person> createMultiple(Iterable<Person> people) {
        return repo.saveAll(people);
    }

    //update
    public Person updatePerson(Long id, Person person){
        Person personToUpdate = repo.findById(id).orElseThrow(EntityNotFoundException::new);
        personToUpdate.setFirstName(person.getFirstName());
        personToUpdate.setLastName(person.getLastName());
        personToUpdate.setMobile(person.getMobile());
        personToUpdate.setBirthDay(person.getBirthDay());
        personToUpdate.setHomeId(person.getHomeId());

        return repo.save(personToUpdate);
    }

    //delete
    public boolean delete(Long id) {
        repo.deleteById(id);
        return true;
    }
}

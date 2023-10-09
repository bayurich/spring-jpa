package ru.netology.hibernatetask1.repository;

import org.springframework.stereotype.Repository;
import ru.netology.hibernatetask1.entity.Person;
import ru.netology.hibernatetask1.entity.PersonId;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MyRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @PostConstruct
    @Transactional
    public void init() {
        /*List<Person> personList = new ArrayList<>();
        personList.add(new Person(new PersonId("aa", "bb", 20), "111111", "Moscow"));
        personList.add(new Person(new PersonId("xx", "yy", 35), "333333", "Sochi"));
        personList.add(new Person(new PersonId("vvv", "bbbbbb", 55), "5555555", "Moscow"));

        personList.forEach(System.out::println);
        personList.forEach(x -> entityManager.persist(x));
        personList.forEach(System.out::println);*/

        Person person = new Person(new PersonId("aa", "bb", 20), "111111", "Moscow");
        //entityManager.getTransaction().begin();
    }


    public List<Person> getPersonsByCity(String city) {

        // v.1
        /*List<Person> personList = entityManager.createQuery("select p from Person p where p.cityOfLiving = :cityName")
                .setParameter("cityName", city)
                .getResultList();*/

        // v.2
        List<Person> personList = entityManager.createQuery("select p from Person p where p.cityOfLiving = ?1")
                .setParameter(1, city)
                .getResultList();

        System.out.println("personList: " + personList);

        return personList;
    }


}

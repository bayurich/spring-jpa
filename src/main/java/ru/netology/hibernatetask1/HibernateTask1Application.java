package ru.netology.hibernatetask1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.netology.hibernatetask1.entity.Person;
import ru.netology.hibernatetask1.entity.PersonId;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;


@SpringBootApplication
public class HibernateTask1Application implements CommandLineRunner {

	@PersistenceContext
	EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(HibernateTask1Application.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
		Person person = new Person(new PersonId("aa", "bb", 20), "111111", "Moscow");
		entityManager.persist(person);
	}
}

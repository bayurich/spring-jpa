package ru.netology.hibernatetask1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernatetask1.entity.Person;
import ru.netology.hibernatetask1.repository.MyRepository;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyRepository repository;


    @GetMapping("persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        System.out.println("start request. name: " + city);

        return repository.getPersonsByCity(city);
    }
}

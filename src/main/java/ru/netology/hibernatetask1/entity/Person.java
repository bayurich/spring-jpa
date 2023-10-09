package ru.netology.hibernatetask1.entity;


import javax.persistence.*;

@Entity
@Table(name = "PERSONS")
public class Person {

    @EmbeddedId
    private PersonId personId;

    @Column(name = "phone_number", nullable = false, length = 50)
    private String phoneNumber;
    @Column(name = "city_of_living", length = 50)
    private String cityOfLiving;

    public Person() {
    }

    public Person(PersonId personId, String phoneNumber, String cityOfLiving) {
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.cityOfLiving = cityOfLiving;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public void setPersonId(PersonId personId) {
        this.personId = personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCityOfLiving() {
        return cityOfLiving;
    }

    public void setCityOfLiving(String cityOfLiving) {
        this.cityOfLiving = cityOfLiving;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cityOfLiving='" + cityOfLiving + '\'' +
                '}';
    }
}

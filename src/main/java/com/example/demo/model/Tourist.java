package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tourist {

    @Id
    @GeneratedValue
    private Long id;



    private String name;
    private String surname;
    private String gender;
    private String country;
    private String description;
    private LocalDate borndate;
    @OneToMany
    private List<Tourist> touristList;

    public Tourist(){

    }
    public Tourist(String name, String surname, String gender, String country, String description, LocalDate borndate) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.country = country;
        this.description = description;
        this.borndate = borndate;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void setBorndate(LocalDate borndate) {
        this.borndate = borndate;
    }

    public LocalDate getBorndate() {
        return borndate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDescription(String description) {
        this.description = description;
    }




    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }


}

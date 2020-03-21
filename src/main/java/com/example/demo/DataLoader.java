package com.example.demo;



import com.example.demo.dao.FlightRepository;
import com.example.demo.dao.TouristRepository;
import com.example.demo.model.Flight;
import com.example.demo.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Component
public class DataLoader implements ApplicationRunner {
    private TouristRepository touristRepository;
    private FlightRepository flightRepository;

    @Autowired
    public DataLoader(TouristRepository touristRepository, FlightRepository flightRepository) {
        this.touristRepository = touristRepository;
        this.flightRepository = flightRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Tourist tourist1 = new Tourist("Adam","Kowalski","Male","Poland",
                "Has green eyes",LocalDate.parse("1968-04-02"));
        Tourist tourist2 = new Tourist("Monika","Czapka","Female","Germany",
                "Has blond straight hair",LocalDate.parse("1999-12-10"));

        touristRepository.save(tourist1);
        touristRepository.save(tourist2);

        flightRepository.save(new Flight(LocalDateTime.parse("2020-08-12T10:00"),
                LocalDateTime.parse("2020-08-12T12:20"),120,125.50));


    }

}

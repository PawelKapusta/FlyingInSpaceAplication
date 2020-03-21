package com.example.demo.controller;

import com.example.demo.dao.FlightRepository;
import com.example.demo.dao.TouristRepository;
import com.example.demo.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TouristController {

    private FlightRepository flightRepository;
    private TouristRepository touristRepository;

    @Autowired
    public TouristController(FlightRepository flightRepository,TouristRepository touristRepository){
        this.flightRepository = flightRepository;
        this.touristRepository = touristRepository;
    }

    @GetMapping("/tourists")
    public List<Tourist> getTourists( @RequestParam("name") Optional<String> name){
        if(name.isPresent()){
            return touristRepository.findAll();
        }else{
            return touristRepository.findAll();
        }
    }

    @PostMapping("/tourists")
    public void addTourist(@RequestBody Tourist tourist){
        touristRepository.save(tourist);
    }



}

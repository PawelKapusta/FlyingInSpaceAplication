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
        if(name.isPresent() ){
            return touristRepository.findTouristByName(name.get());
        }else{
            return touristRepository.findAll();
        }
    }

    @PostMapping(path = "/tourists", consumes = "application/json", produces = "application/json")
    public void addTourist(@RequestBody Tourist tourist){
        touristRepository.save(tourist);
    }
    @DeleteMapping("/tourists/{id}")
    public void deleteTourist(@PathVariable(value = "id") Long id){
        touristRepository.deleteById(id);
    }



}

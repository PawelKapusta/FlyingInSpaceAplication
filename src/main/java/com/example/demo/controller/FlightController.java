package com.example.demo.controller;

import com.example.demo.dao.FlightRepository;
import com.example.demo.dao.TouristRepository;
import com.example.demo.model.Flight;
import com.example.demo.model.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
public class FlightController {


    private FlightRepository flightRepository;
    private TouristRepository touristRepository;
    @Autowired
    public FlightController(FlightRepository flightRepository,TouristRepository touristRepository){
        this.flightRepository = flightRepository;
        this.touristRepository = touristRepository;
    }

    @GetMapping("/flights")
    public List<Flight> getFlights(@RequestParam("arrivalDate")Optional<LocalDateTime> arrivalDate){
        if(arrivalDate.isPresent()){
            return flightRepository.findAllByArrivalDate(arrivalDate);
        }else{
            return flightRepository.findAll();
        }
    }
    @PostMapping(path = "/flights", consumes = "application/json", produces = "application/json")
    public void addTourist(@RequestBody Flight flight){
        flightRepository.save(flight);
    }

    @DeleteMapping("/flights/{id}")
    public void deleteTourist(@PathVariable(value = "id") Long id){
        flightRepository.deleteById(id);
    }

}

package com.example.demo.controller;

import com.example.demo.dao.FlightRepository;
import com.example.demo.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FlightController {


    private FlightRepository flightRepository;
    @Autowired
    public FlightController(FlightRepository flightRepository){
        this.flightRepository = flightRepository;
    }

    @GetMapping("/flights")
    public List<Flight> getFlights(){
        return flightRepository.findAll();
    }
    @PostMapping("/tourist")
    public void addTourist(){

    }

    @DeleteMapping("/tourist")
    public void deleteTourist(){

    }



}

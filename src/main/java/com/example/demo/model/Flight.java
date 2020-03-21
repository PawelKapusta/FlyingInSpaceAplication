package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private Long id;

    LocalDateTime arrivalDate;
    LocalDateTime departureDate;
    int howManySeats;
    double priceForTicket;


    public Flight(){

    }

    public Flight(LocalDateTime arrivalDate, LocalDateTime departureDate, int howManySeats, double priceForTicket) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.howManySeats = howManySeats;
        this.priceForTicket = priceForTicket;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public void setHowManySeats(int howManySeats) {
        this.howManySeats = howManySeats;
    }


    public void setPriceForTicket(double priceForTicket) {
        this.priceForTicket = priceForTicket;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public int getHowManySeats() {
        return howManySeats;
    }



    public double getPriceForTicket() {
        return priceForTicket;
    }
}
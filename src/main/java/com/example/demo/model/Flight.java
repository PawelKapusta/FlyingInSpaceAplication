package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Flight {

    @Id
    @GeneratedValue
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    LocalDate arrivalDate;
    LocalDate departureDate;
    int howManySeats;

    double priceForTicket;

    public Flight(){

    }

    public Flight(LocalDate arrivalDate, LocalDate departureDate, int howManySeats, double priceForTicket) {
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.howManySeats = howManySeats;
        this.priceForTicket = priceForTicket;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public void setHowManySeats(int howManySeats) {
        this.howManySeats = howManySeats;
    }


    public void setPriceForTicket(double priceForTicket) {
        this.priceForTicket = priceForTicket;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public int getHowManySeats() {
        return howManySeats;
    }



    public double getPriceForTicket() {
        return priceForTicket;
    }
}
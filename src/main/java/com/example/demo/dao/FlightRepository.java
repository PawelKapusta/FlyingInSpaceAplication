package com.example.demo.dao;

import com.example.demo.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends CrudRepository<Flight,Long> {

    List<Flight> findAll();

    Flight save(Flight flight);

}

package com.example.demo.dao;

import com.example.demo.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface FlightRepository extends CrudRepository<Flight,Long> {

    List<Flight> findAll();

    Flight save(Flight flight);

    List<Flight> findAllByArrivalDate(Optional<LocalDateTime> arrivalDate);
}

package com.example.demo.dao;

import com.example.demo.model.Tourist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TouristRepository extends CrudRepository<Tourist,Long> {

    List<Tourist> findAll();
    List<Tourist> findTouristByName(String name);
    Tourist save(Tourist tourist);

}

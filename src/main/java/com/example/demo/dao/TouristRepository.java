package com.example.demo.dao;

import com.example.demo.model.Tourist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristRepository extends CrudRepository<Tourist,Long> {

    List<Tourist> findAll();
//    List<Tourist> findAllBy(String name, String surname);
    Tourist save(Tourist tourist);

}

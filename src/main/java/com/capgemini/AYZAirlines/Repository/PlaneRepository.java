package com.capgemini.AYZAirlines.Repository;

import com.capgemini.AYZAirlines.model.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaneRepository extends CrudRepository<Plane, Integer> {

    //List<Plane> findByName(String name);
    //List<Plane> findById(int id);
    Plane findById(int id);
}

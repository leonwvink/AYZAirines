package com.capgemini.AYZAirlines.Repository;

import com.capgemini.AYZAirlines.model.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Integer> {

    List<Airport> findByName(String name);
}

package com.capgemini.AYZAirlines.controller;


import com.capgemini.AYZAirlines.Repository.AirportRepository;
import com.capgemini.AYZAirlines.model.Airport;
import com.capgemini.AYZAirlines.model.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/airport")
public class AirportController {

    @Autowired
    private AirportRepository airportRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createAirport(Airport airport) {
        this.airportRepository.save(airport);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Airport> getAll(Airport airport) {
        return this.airportRepository.findAll();
    }




}

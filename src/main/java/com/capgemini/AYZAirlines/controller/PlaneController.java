package com.capgemini.AYZAirlines.controller;


import com.capgemini.AYZAirlines.Repository.PlaneRepository;
import com.capgemini.AYZAirlines.model.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/plane")
public class PlaneController {


    @Autowired
    private PlaneRepository planeRepository;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createPlane(Plane plane) { this.planeRepository.save(plane); }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Plane> getAll(Plane plane) {
        return this.planeRepository.findAll();
    }
}

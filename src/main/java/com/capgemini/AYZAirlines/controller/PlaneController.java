package com.capgemini.AYZAirlines.controller;


import com.capgemini.AYZAirlines.Repository.PlaneRepository;
import com.capgemini.AYZAirlines.model.Airport;
import com.capgemini.AYZAirlines.model.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/plane")
public class PlaneController {


    @Autowired
    private PlaneRepository planeRepository;

    // Create a plane
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createPlane(Plane plane) { this.planeRepository.save(plane); }

    // Get all planes
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Iterable<Plane> getAll() {
        return this.planeRepository.findAll();
    }

    // Change Airport #fly
    @RequestMapping(value = "/fly", method = RequestMethod.PUT)
    public void fly(@PathVariable int id, @PathVariable Airport airport){
        Plane plane = planeRepository.findById(id);
        plane.setAirport(airport);
        plane.setTank(plane.getTank() - 20);
        planeRepository.save(plane);
    }

    // fill tank
    @RequestMapping(value = "/tank", method = RequestMethod.PUT)
    public void tank(@PathVariable int id, @PathVariable int amount) {
        Plane plane = planeRepository.findById(id);
        plane.setTank(plane.getTank() + amount);
        planeRepository.save(plane);
    }


}

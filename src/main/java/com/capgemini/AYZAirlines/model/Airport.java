package com.capgemini.AYZAirlines.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Airport {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany
    private List<Plane> Planes;


}

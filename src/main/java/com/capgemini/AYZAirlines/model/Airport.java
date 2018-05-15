package com.capgemini.AYZAirlines.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Airport {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany
    private List<Plane> Planes;


}

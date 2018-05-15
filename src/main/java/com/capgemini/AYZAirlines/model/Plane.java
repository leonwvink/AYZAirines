package com.capgemini.AYZAirlines.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Plane {

    @Id
    @GeneratedValue
    private int id;

    private int tank;

    @NotNull
    @OneToMany
    private String location;


}

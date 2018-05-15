package com.capgemini.AYZAirlines.model;

import javax.persistence.*;


@Entity
public class Plane {

    @Id
    @GeneratedValue
    private int id;

    private int tank;

    @ManyToOne
    private Airport airport;


}

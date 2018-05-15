package com.capgemini.AYZAirlines.model;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Plane {

    @Id
    @GeneratedValue
    private int id;

    private int tank;

    @ManyToOne
    private Airport airport;


}

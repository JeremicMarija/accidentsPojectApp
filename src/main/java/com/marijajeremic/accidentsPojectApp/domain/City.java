package com.marijajeremic.accidentsPojectApp.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class City implements Serializable {

//    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String zipCode;


//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "accident_id", referencedColumnName = "id")
//    private List<TrafficAccident> trafficAccidents;

//    @JsonIgnore
    @OneToMany(mappedBy = "city")
    private List<TrafficAccident> trafficAccidents;
//    private Set<TrafficAccident> trafficAccidents = new HashSet<>();



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public List<TrafficAccident> getTrafficAccidents() {
        return trafficAccidents;
    }

    public void assignCity(City city) {
    }
}

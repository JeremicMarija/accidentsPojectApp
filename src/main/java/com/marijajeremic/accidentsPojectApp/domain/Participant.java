package com.marijajeremic.accidentsPojectApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Participant implements Serializable {

//    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private LocalDateTime dateOfBirth;


//    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledParticipants")
    private List<TrafficAccident> accidents;




//    @ManyToMany
//    @JoinColumns({
//            @JoinColumn(name = "participant_id", referencedColumnName = "id")
//    })
//    private List<TrafficAccident> trafficAccidents;




    @OneToOne(mappedBy = "participant")
    private Vehicle vehicles;



//    public List<TrafficAccident> getTrafficAccidents() {
//        return trafficAccidents;
//    }
//
//    public void setTrafficAccidents(List<TrafficAccident> trafficAccidents) {
//        this.trafficAccidents = trafficAccidents;
//    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    public List<TrafficAccident> getAccidents() {
//        return accidents;
//    }
//
//    public void setAccidents(List<TrafficAccident> accidents) {
//        this.accidents = accidents;
//    }




}




//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(
//            name = "accident_enrolled",
//            joinColumns = @JoinColumn(name = "participant_id"),
//            inverseJoinColumns = @JoinColumn(name = "accident_id")
//    )
//    private List<TrafficAccident> enrolledAccidents;



//    @JsonIgnore
//    @ManyToMany(mappedBy = "enrolledParticipants")
//    private List<TrafficAccident> accidents;
//    private Set<TrafficAccident> accidents = new HashSet<>();



//    public void setAccidents(List<TrafficAccident> accidents) {
//        this.enrolledAccidents = accidents;
//    }
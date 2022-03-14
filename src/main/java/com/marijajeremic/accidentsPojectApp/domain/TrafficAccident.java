package com.marijajeremic.accidentsPojectApp.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class TrafficAccident implements Serializable {

//    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    @Enumerated(EnumType.STRING)
    private AccidentType type;

    @Column
    private LocalDateTime time;



    @ManyToMany
    @JoinTable(
            name = "participant_enrolled",
            joinColumns = @JoinColumn(name = "accident_id"),
            inverseJoinColumns = @JoinColumn(name = "participant_id")
    )
    private List<Participant> enrolledParticipants;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;

//    @ManyToOne(mappedBy = "trafficAccidents")
//    private City city;


    public TrafficAccident() {
    }

//    public List<Participant> getParticipants() {
//        return participants;
//    }
//
//    public void setParticipants(List<Participant> participants) {
//        this.participants = participants;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AccidentType getType() {
        return type;
    }

    public void setType(AccidentType type) {
        this.type = type;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

//    public List<Participant> getEnrolledParticipants() {
//        return enrolledParticipants;
//    }

    public City getCity() {
        return city;
    }

    public void assignCity(City city) {
        this.city = city;
    }
}





//    @JsonIgnore
//    @ManyToMany
//    @JoinTable(
//            name = "participant_enrolled",
//            joinColumns = @JoinColumn(name = "accident_id"),
//            inverseJoinColumns = @JoinColumn(name = "participant_id")
//    )
//    private List<Participant> enrolledParticipants;

//primer za SET
//    private Set<Participant> participants = new HashSet<>();
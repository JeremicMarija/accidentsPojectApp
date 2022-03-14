package com.marijajeremic.accidentsPojectApp.controller;

import com.marijajeremic.accidentsPojectApp.domain.City;
import com.marijajeremic.accidentsPojectApp.domain.Participant;
import com.marijajeremic.accidentsPojectApp.domain.TrafficAccident;
import com.marijajeremic.accidentsPojectApp.services.CityService;
import com.marijajeremic.accidentsPojectApp.services.ParticipantService;
import com.marijajeremic.accidentsPojectApp.services.TrafficAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TrafficAccidentRestController {

    @Autowired
    private final TrafficAccidentService trafficAccidentService;


    @Autowired
    private final ParticipantService participantService;


    @Autowired
    private final CityService cityService;


    public TrafficAccidentRestController(TrafficAccidentService trafficAccidentService, ParticipantService participantService, CityService cityService) {
        this.trafficAccidentService = trafficAccidentService;
        this.participantService = participantService;
        this.cityService = cityService;
    }


    @GetMapping("/allAccidents")
    public ResponseEntity<List<TrafficAccident>> getAllAccidents(){
        List<TrafficAccident> accidents = trafficAccidentService.findAllAccidents();
        return new ResponseEntity<>(accidents, HttpStatus.OK);
    }


    @GetMapping("/allParticipants")
    public ResponseEntity<List<Participant>> getAllParticipants(){
        List<Participant> participants = participantService.findAllParticipant();
        return new ResponseEntity<>(participants, HttpStatus.OK);
    }

    @GetMapping("/allCities")
    public ResponseEntity<List<City>> getAllCities(){
        List<City> cities = cityService.findAllCities();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }



//    @PutMapping("/{participantId}/accidents/{accidentId}")
//    Participant enrollTrafficAccidentToParticipant(
//            @PathVariable Long participantId,
//            @PathVariable Long accidentId
//    ){
//        Participant participant = participantRepository.findById(participantId).get();
//        TrafficAccident accident = trafficAccidentRepository.findById(accidentId).get();
//        participant.ennrollAccident(accident);
//        return participantRepository.save(participant);
//    }
//
//
//    @PutMapping("/{accidentId}/city/{cityId}")
//    TrafficAccident assignCityToAccident(
//            @PathVariable Long cityId,
//            @PathVariable Long accidentId
//    ){
//        City city = cityRepository.findById(cityId).get();
//        TrafficAccident accident = trafficAccidentRepository.findById(accidentId).get();
//        accident.assignCity(city);
//        return trafficAccidentRepository.save(accident);
//    }



}

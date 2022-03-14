package com.marijajeremic.accidentsPojectApp.services;

import com.marijajeremic.accidentsPojectApp.domain.TrafficAccident;

import java.util.List;


public interface TrafficAccidentService {

    List<TrafficAccident> findAllAccidents();
}

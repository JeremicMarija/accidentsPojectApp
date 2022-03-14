package com.marijajeremic.accidentsPojectApp.services.impl;

import com.marijajeremic.accidentsPojectApp.domain.TrafficAccident;
import com.marijajeremic.accidentsPojectApp.repository.TrafficAccidentRepository;
import com.marijajeremic.accidentsPojectApp.services.TrafficAccidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class TrafficAccidentImpl implements TrafficAccidentService {

    private final TrafficAccidentRepository trafficAccidentRepository;

    @Autowired
    public TrafficAccidentImpl(TrafficAccidentRepository trafficAccidentRepository) {
        this.trafficAccidentRepository = trafficAccidentRepository;
    }

    @Override
    public List<TrafficAccident> findAllAccidents() {
        return (List<TrafficAccident>) trafficAccidentRepository.findAll();
    }
}


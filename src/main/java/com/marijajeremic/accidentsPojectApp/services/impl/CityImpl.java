package com.marijajeremic.accidentsPojectApp.services.impl;

import com.marijajeremic.accidentsPojectApp.domain.City;
import com.marijajeremic.accidentsPojectApp.repository.CityRepository;
import com.marijajeremic.accidentsPojectApp.services.CityService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CityImpl implements CityService {

    private CityRepository cityRepository;

    public CityImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public List<City> findAllCities() {
        return (List<City>) cityRepository.findAll();
    }
}

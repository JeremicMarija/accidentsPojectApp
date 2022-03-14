package com.marijajeremic.accidentsPojectApp.repository;

import com.marijajeremic.accidentsPojectApp.domain.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}

package com.marijajeremic.accidentsPojectApp.repository;

import com.marijajeremic.accidentsPojectApp.domain.TrafficAccident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrafficAccidentRepository extends JpaRepository<TrafficAccident, Long> {

}

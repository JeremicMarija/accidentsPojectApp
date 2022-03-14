package com.marijajeremic.accidentsPojectApp.repository;

import com.marijajeremic.accidentsPojectApp.domain.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}

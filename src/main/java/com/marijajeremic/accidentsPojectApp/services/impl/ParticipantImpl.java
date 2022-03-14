package com.marijajeremic.accidentsPojectApp.services.impl;

import com.marijajeremic.accidentsPojectApp.domain.Participant;
import com.marijajeremic.accidentsPojectApp.repository.ParticipantRepository;
import com.marijajeremic.accidentsPojectApp.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ParticipantImpl implements ParticipantService {

    private ParticipantRepository participantRepository;

    @Autowired
    public ParticipantImpl(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    @Override
    public List<Participant> findAllParticipant() {
        return (List<Participant>) participantRepository.findAll();
    }
}

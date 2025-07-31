package com.afminguela.Nurses.services;

import com.afminguela.Nurses.models.Conferences;

import com.afminguela.Nurses.repositories.ConferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferencesService {
    private final ConferencesRepository conferencesRepository;
    @Autowired
    public ConferencesService(ConferencesRepository conferencesRepository) {
        this.conferencesRepository = conferencesRepository;
    }

    public List<Conferences> getConferences() {
        return conferencesRepository.findAll();

    }

    public List<Conferences> getConferencesByName(String name) {
        return conferencesRepository.findConferencesByTitle(name);
    }
    public List<Conferences> getConferencesById(Integer id) {
        return conferencesRepository.findAllById(id);
    }

    public Conferences save(Conferences conferences) {
        return conferencesRepository.save( conferences);
    }

    public Conferences deleteById(Integer id) {
        conferencesRepository.deleteById(id);
        return null;
    }

    public Conferences findById(Integer id) {
        return conferencesRepository.findById(id).orElse(null);
    }


}
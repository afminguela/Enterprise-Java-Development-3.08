package com.afminguela.Nurses.services;

import com.afminguela.Nurses.models.Association;
import com.afminguela.Nurses.repositories.AssociationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AssociationService {

    private final AssociationRepository associationRepository;

    @Autowired
    public AssociationService(AssociationRepository associationRepository) {
        this.associationRepository = associationRepository;
    }

    public List<Association> findAll() {
        return associationRepository.findAll();
    }

    public Optional<Association> findById(Integer id) {
        return associationRepository.findById(id);
    }

    public Association save(Association association) {
        return associationRepository.save(association);
    }

    public void deleteById(Integer id) {
        associationRepository.deleteById(id);
    }
}
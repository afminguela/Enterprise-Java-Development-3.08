package com.afminguela.Nurses.services;

import com.afminguela.Nurses.models.Chapters;
import com.afminguela.Nurses.repositories.ChaptersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChaptersService {

    private final ChaptersRepository chaptersRepository;

    @Autowired
    public ChaptersService(ChaptersRepository chaptersRepository) {
        this.chaptersRepository = chaptersRepository;
    }

    public List<Chapters> findAll() {
        return chaptersRepository.findAll();
    }

    public Optional<Chapters> findById(Integer id) {
        return chaptersRepository.findById(id);
    }

    public Chapters save(Chapters chapters) {
        return chaptersRepository.save(chapters);
    }

    public void deleteById(Integer id) {
        chaptersRepository.deleteById(id);
    }
}
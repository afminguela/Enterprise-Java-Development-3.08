package com.afminguela.Nurses.controllers;

import com.afminguela.Nurses.models.Conferences;
import com.afminguela.Nurses.services.ConferencesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conferences")
public class ConferenceController {

    private final ConferencesService conferencesService;

    @Autowired
    public ConferenceController(ConferencesService conferencesService) {
        this.conferencesService = conferencesService;
    }

    @GetMapping
    public List<Conferences> getAllConferences() {
        return conferencesService.getConferences();
    }

    @GetMapping("/{id}")
    public Conferences getConferencesById(@PathVariable Integer id) {
        return conferencesService.findById(id);
    }

    @PostMapping
    public Conferences createConference(@RequestBody Conferences conference) {
        return conferencesService.save(conference);
    }

    @PutMapping("/{title}")
    public Conferences updateConference(@PathVariable String title, @RequestBody Conferences conferences) {
        conferences.setTitle(title);
        return conferencesService.save(conferences);
    }

    @DeleteMapping("/{id}")
    public void deleteConference(@PathVariable Integer id) {
        conferencesService.deleteById(id);
    }
}
package com.afminguela.Nurses.controllers;

import com.afminguela.Nurses.models.Association;
import com.afminguela.Nurses.services.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/associations")
public class AssociationController {

    private final AssociationService associationService;

    @Autowired
    public AssociationController(AssociationService associationService) {
        this.associationService = associationService;
    }

    @GetMapping
    public List<Association> getAllAssociations() {
        return associationService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Association> getAssociationById(@PathVariable Integer id) {
        return associationService.findById(id);
    }

    @PostMapping
    public Association createAssociation(@RequestBody Association association) {
        return associationService.save(association);
    }

    @PutMapping("/{id}")
    public Association updateAssociation(@PathVariable Integer id, @RequestBody Association association) {
        association.setId(id);
        return associationService.save(association);
    }

    @DeleteMapping("/{id}")
    public void deleteAssociation(@PathVariable Integer id) {
        associationService.deleteById(id);
    }
}
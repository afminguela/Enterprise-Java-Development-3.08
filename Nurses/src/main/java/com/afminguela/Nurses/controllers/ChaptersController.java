package com.afminguela.Nurses.controllers;

import com.afminguela.Nurses.models.Chapters;
import com.afminguela.Nurses.services.ChaptersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/chapters")
public class ChaptersController {

    private final ChaptersService chaptersService;

    @Autowired
    public ChaptersController(ChaptersService chaptersService) {
        this.chaptersService = chaptersService;
    }

    @GetMapping
    public List<Chapters> getAllChapters() {
        return chaptersService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Chapters> getChapterById(@PathVariable Integer id) {
        return chaptersService.findById(id);
    }

    @PostMapping
    public Chapters createChapter(@RequestBody Chapters chapters) {
        return chaptersService.save(chapters);
    }

    @PutMapping("/{id}")
    public Chapters updateChapter(@PathVariable String name, @RequestBody Chapters chapters) {
        chapters.setNameChapter(name);
        return chaptersService.save(chapters);
    }

    @DeleteMapping("/{id}")
    public void deleteChapter(@PathVariable Integer id) {
        chaptersService.deleteById(id);
    }
}
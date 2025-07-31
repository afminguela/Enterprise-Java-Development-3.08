package com.afminguela.Nurses.repositories;

import com.afminguela.Nurses.models.Chapters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaptersRepository extends JpaRepository<Chapters, Integer> {
}

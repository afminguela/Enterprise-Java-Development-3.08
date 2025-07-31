package com.afminguela.Nurses.repositories;

import com.afminguela.Nurses.models.Conferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConferencesRepository extends JpaRepository<Conferences, Integer> {
    List<Conferences> findConferencesByTitle(String title);

    List<Conferences> findAllById(Integer id);
}

package com.afminguela.Nurses.repositories;

import com.afminguela.Nurses.models.Exhibitions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhibitionsRepository extends JpaRepository<Exhibitions, Integer> {
}

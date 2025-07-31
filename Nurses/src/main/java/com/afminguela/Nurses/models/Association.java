package com.afminguela.Nurses.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAssociation;
    private String nameAssociation;
    @OneToMany  //las listas han de llevar siempre OnetoMany que si no no funcionan.
    private List<Chapters> chaptersList;



}

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
public class Chapters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idChapter;

    @ManyToOne
    @JoinColumn(name = "id_association")
    private Association association;

    @OneToOne
    @JoinColumn(name = "id_nurse")
    private Nurse president;

    private String nameChapter;
    private String location;
    private String district;
    @OneToMany
    private List<Nurse> nurses;

}

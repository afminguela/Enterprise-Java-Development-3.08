package com.afminguela.Nurses.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@MappedSuperclass
@Data
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer EventId;

    @OneToOne
    @JoinColumn(name = "organicer_id_chapter")
    private Chapters organicer;

    private String localization;
    private Date startDate;
    private String title;

}

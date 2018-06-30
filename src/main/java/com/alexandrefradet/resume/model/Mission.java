package com.alexandrefradet.resume.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
public class Mission {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String title;

    private LocalDate startDate;

    private LocalDate endDate;

    private String description;

    @ManyToOne
    @JoinColumn(name="experience_id")
    private Experience experience;
}

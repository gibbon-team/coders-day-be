package com.codersday.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column
    String description;

    @ManyToOne
    Quiz quiz;

    @OneToMany(mappedBy = "question")
    List<Answer> answers;
}

package com.codersday.model;

import lombok.Data;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

@Data
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column
    String description;

    @JsonIgnore
    @ManyToOne
    Quiz quiz;

    @OneToMany(mappedBy = "question")
    List<Answer> answers;
}

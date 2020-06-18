package com.codersday.model;

import lombok.Data;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
public class Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column
    String description;

    @Column
    Boolean isCorrect;

    @JsonIgnore
    @ManyToOne
    Question question;
}

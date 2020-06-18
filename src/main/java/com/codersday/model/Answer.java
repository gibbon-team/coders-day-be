package com.codersday.model;

import lombok.Data;

import javax.persistence.*;

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

    @ManyToOne
    Question question;
}

package com.codersday.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @Column
    String name;

    @OneToMany(mappedBy = "quiz")
    List<Question> questions;

    @Column
    Status status;

    public static enum Status {
        TEMPLATE, RUNNING, WAITING, FINISHED
    }

}
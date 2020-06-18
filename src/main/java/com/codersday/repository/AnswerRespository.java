package com.codersday.repository;

import com.codersday.model.Answer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRespository extends JpaRepository<Answer, Long> {

}
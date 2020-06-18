package com.codersday.repository;

import com.codersday.model.Answer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRespository extends CrudRepository<Answer, Long> {

}
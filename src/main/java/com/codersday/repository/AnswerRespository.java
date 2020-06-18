package com.codersday.repository;

import com.codersday.model.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerRespository extends CrudRepository<Answer, Long> {

}
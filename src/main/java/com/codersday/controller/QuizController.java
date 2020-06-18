package com.codersday.controller;

import java.util.List;

import com.codersday.model.Quiz;
import com.codersday.repository.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/quiz")
public class QuizController {

    QuizRepository quizRepository;

    public QuizController(@Autowired QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @PostMapping
    public ResponseEntity<Quiz> saveQuiz(@RequestBody Quiz quiz) {
        quiz = quizRepository.save(quiz);
        return ResponseEntity.ok(quiz);
    }

    @GetMapping
    public ResponseEntity<List<Quiz>> getQuizes() {
        return ResponseEntity.ok(quizRepository.findAll());
    }

}
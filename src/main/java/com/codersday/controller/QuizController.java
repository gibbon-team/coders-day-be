package com.codersday.controller;

import java.util.List;

import com.codersday.model.Answer;
import com.codersday.model.Question;
import com.codersday.model.Quiz;
import com.codersday.repository.AnswerRespository;
import com.codersday.repository.QuestionRepository;
import com.codersday.repository.QuizRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/quiz")
@RequiredArgsConstructor
public class QuizController {

    private final QuizRepository quizRepository;
    private final AnswerRespository answerRespository;
    private final QuestionRepository questionRepository;

    @PostMapping
    public ResponseEntity<Quiz> saveQuiz(@RequestBody Quiz quiz) {
        quiz.getQuestions().forEach(question -> {
            List<Answer> answers1 = answerRespository.saveAll(question.getAnswers());
            question.setAnswers(answers1);
        });

        List<Question> questions = questionRepository.saveAll(quiz.getQuestions());
        quiz.setQuestions(questions);

        Quiz saved = quizRepository.save(quiz);

        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<Quiz>> getQuizes() {
        return ResponseEntity.ok(quizRepository.findAll());
    }

}
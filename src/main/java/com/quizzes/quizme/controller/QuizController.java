/*
    Note: QuizGroup groups quizzes;
*/

package com.quizzes.quizme.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.quizzes.quizme.entity.Quiz;
import com.quizzes.quizme.operation.QuizService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
public class QuizController {
    private QuizService quizService;
    
    @Autowired
    QuizController(QuizService quizService){
        this.quizService = quizService;
    }

    @GetMapping(path = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Optional<Quiz> getQuiz(@PathVariable long id) {
        return quizService.findById(id);
    }

    @PostMapping(path="/add", produces = APPLICATION_JSON_VALUE)
    public long createQuiz(@PathVariable String question, 
                            @PathVariable String answer) {
        return this.quizService.create(question, answer);
    }
}


package com.quizzes.quizme.operation;

import java.util.Optional;


import com.quizzes.quizme.entity.Quiz;
import com.quizzes.quizme.repository.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {
    private QuizRepository quizRepository;
    // private UserRepository userRepository;

    @Autowired
    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    public Optional<Quiz> findById(long id) {
        return quizRepository.findById(id);
    }

    public long create(String question, String answer){
        Quiz quiz = new Quiz(question,answer);
        return this.quizRepository.save(quiz).getId();
    }
}

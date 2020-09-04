package com.quizzes.quizme.operation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.quizzes.quizme.data.entity.Quiz;
import com.quizzes.quizme.data.entity.quiz;
import com.quizzes.quizme.data.repository.QuizRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizGroup {
    private QuizRepository quizRepository;
    
    @Autowired
    QuizGroup(QuizRepository quizRepository){
        this.quizRepository = quizRepository;
    }

    public List<Quiz> findAllQuizByCategory(String category){
        List<Quiz> quizzes;

        //add implementations 
        return quizzes;

    }
}


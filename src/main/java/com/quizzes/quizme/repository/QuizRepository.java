package com.quizzes.quizme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.quizzes.quizme.entity.Quiz;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long>{}

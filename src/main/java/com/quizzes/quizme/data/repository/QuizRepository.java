package com.quizzes.quizme.data.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.quizzes.quizme.data.entity.Quiz;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long>{
    
}

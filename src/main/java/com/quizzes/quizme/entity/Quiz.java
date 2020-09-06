package com.quizzes.quizme.entity;

import javax.persistence.*;

@Entity
public class Quiz {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quizId;
    @Column(name="QUESTION")
    private String question;
    @Column(name="ANSWER")
    private String answer;

    public Quiz(String question, String answer){
        this.question=question;
        this.answer=answer;
    }
    public long getId() {
        return quizId;
    }

    public void setQuizId(long quizId) {
        this.quizId = quizId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}

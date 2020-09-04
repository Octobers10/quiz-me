package com.quizzes.quizme.data.entity;

import java.util.*;

import javax.persistence.*;

@Entity
public class Quiz {
    @Id
    @Column(name="QUIZ_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long quizId;
    @Column(name="QUIZ_QUESTION")
    private String question;
    @Column(name="QUIZ_ANSWER1")
    private String answer1;
    @Column(name="QUIZ_ANSWER2")
    private String answer2;
    @Column(name="QUIZ_ANSWER3")
    private String answer3;
    @Column(name="QUIZ_ANSWER4")
    private String answer4;

    public long getQuizId() {
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

    public String[] getOptions() {
        String [] options = { answer1, answer2, answer3, answer4};
        List<String> list = Arrays.asList(options);
        Collections.shuffle(list);
        list.toArray(options);
        return options;
    }

    public void setOptions(String[] options) {
        assert(options.length == 4);
        answer1 = options[0];
        answer1 = options[1];
        answer1 = options[2];
        answer1 = options[3];
    }

    public boolean isCorrect(String answer) {
        return answer1.equals(answer);
    }

    public String correctAnswer() {
        return answer1;
    }

}

package com.sebastien.quizapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Question {


    @Column
    @Id
    private Integer Id;

    @Column
    private String category;

    @Column
    private String difficultyLevel;

    @Column
    private String option1;

    @Column
    private String option2;

    @Column
    private String option3;

    @Column
    private String option4;

    @Column
    private String questionTitle;

    @Column
    private String rightAnswer;

}

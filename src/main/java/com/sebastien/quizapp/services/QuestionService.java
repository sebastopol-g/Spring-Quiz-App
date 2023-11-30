package com.sebastien.quizapp.services;

import com.sebastien.quizapp.domain.Question;
import com.sebastien.quizapp.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository repository;

    public List<Question> getAllQuestions() {
        return repository.findAll();
    }
}

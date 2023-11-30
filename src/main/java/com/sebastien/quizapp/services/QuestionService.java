package com.sebastien.quizapp.services;

import com.sebastien.quizapp.domain.Question;
import com.sebastien.quizapp.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository repository;

    public List<Question> getAllQuestions() {
        return repository.findAll();
    }

    public Optional<Question> getAQuestion(Long id) {
        return repository.findById(id);
    }

    public void delete(Question question) {
        repository.delete(question);
    }
}

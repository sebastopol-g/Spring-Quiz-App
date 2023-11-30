package com.sebastien.quizapp;

import com.sebastien.quizapp.domain.Question;
import com.sebastien.quizapp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("getAll")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("getOne/{id}")
    public Optional<Question> getAQuestion(@PathVariable Long id){
        return questionService.getAQuestion(id);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteAQuestion(@PathVariable("id") Long id){
        if(getAQuestion(id).isPresent()){
            questionService.delete(getAQuestion(id).get());
            return ResponseEntity.status(200)
                    .body("Question is deleted");
        }else{
            return ResponseEntity.status(404)
                    .body("Question does not exist");
        }
    }
}

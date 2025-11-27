package com.example.demo.controller.v1;

import com.example.demo.dto.question.QuestionResponse;
import com.example.demo.service.AnswerService;
import com.example.demo.service.QuestionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "Question", description = "질문 관련 엔드포인트")
@RestController
@RequestMapping("v1/question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<QuestionResponse> getQuestion() {
        int step = AnswerService.answers.size() + 1;
        QuestionResponse questionResponse = questionService.getQuestion(step);
        return ResponseEntity.ok(questionResponse);
    }
}

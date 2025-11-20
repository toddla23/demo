package com.example.demo.controller.v1;

import com.example.demo.dto.answer.AnswerRequest;
import com.example.demo.dto.question.QuestionResponse;
import com.example.demo.service.QuestionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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
        QuestionResponse questionResponse = questionService.getQuestion();
        return ResponseEntity.ok(questionResponse);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<AnswerRequest> postQuestion(@Valid @RequestBody AnswerRequest answerRequest) {
        questionService.saveQuestion(answerRequest);
        return ResponseEntity.ok(answerRequest);
    }
}

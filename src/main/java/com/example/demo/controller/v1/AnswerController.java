package com.example.demo.controller.v1;


import com.example.demo.domain.Answer;
import com.example.demo.dto.answer.AnswerRequest;
import com.example.demo.service.AnswerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Tag(name = "Answer", description = "질문에 대한 응답 관련 엔드포인트")
@RestController
@RequestMapping("/v1/answers")
public class AnswerController {
    @Autowired
    AnswerService answerService;


    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<ArrayList<Answer>> saveAnswer(@Valid @RequestBody AnswerRequest answerRequest) {
        ArrayList<Answer> result = answerService.saveAnswer(answerRequest);
        answerService.printAnswers();
        return ResponseEntity.ok(result);
    }
}

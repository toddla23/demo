package com.example.demo.service;

import com.example.demo.dto.question.QuestionResponse;
import com.example.demo.dto.result.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class AiService {

    @Autowired
    WebClient webClient;

    public QuestionResponse getQuestion(int step) {
        QuestionResponse questionResponse = webClient.get().uri("http://question-server:8080/questions/" + Integer.toString(step)).retrieve().bodyToMono(QuestionResponse.class).block();

//        QuestionResponse questionResponse = webClient.get().uri("http://172.18.0.3:8080/questions/" + Integer.toString(step)).retrieve().bodyToMono(QuestionResponse.class).block();
        return questionResponse;
    }

    public ResultResponse getResult() {

        return webClient.post().uri("http://localhost:12313/answers").bodyValue(AnswerService.answers).retrieve().bodyToMono(ResultResponse.class).block();

    }
}

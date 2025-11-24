package com.example.demo.service;

import com.example.demo.domain.Question;
import com.example.demo.dto.question.QuestionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;

@Service
public class QuestionService {

    @Autowired
    WebClient webClient;

    public QuestionResponse getQuestion(int step) {

        QuestionResponse questionResponse = webClient.get().uri("http://localhost:8080/questions/" + Integer.toString(step)).retrieve().bodyToMono(QuestionResponse.class).block();


        return questionResponse;
    }
}

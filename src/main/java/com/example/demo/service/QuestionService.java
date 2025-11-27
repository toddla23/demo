package com.example.demo.service;

import com.example.demo.dto.question.QuestionResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;

@Service
public class QuestionService {
    @Autowired
    AiService aiService;

    public QuestionResponse getQuestion(int step) {
        return aiService.getQuestion(step);
    }
}

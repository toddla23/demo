package com.example.demo.service;

import com.example.demo.dto.question.QuestionResponse;
import com.example.demo.dto.result.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ResultService {
    @Autowired
    AiService aiService;
    public ResultResponse getResult() {
        ResultResponse result = aiService.getResult();

        return result;
    }
}

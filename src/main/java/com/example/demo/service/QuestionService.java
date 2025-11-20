package com.example.demo.service;

import com.example.demo.dto.answer.AnswerRequest;
import com.example.demo.dto.question.QuestionResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class QuestionService {
    public QuestionResponse getQuestion() {
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("test1");
        answers.add("test2");
        QuestionResponse questionResponse = new QuestionResponse("test", answers);
        return questionResponse;
    }

    public String saveQuestion(AnswerRequest answerRequest){

        return "OK";
    }
}

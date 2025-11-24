package com.example.demo.service;

import com.example.demo.domain.Answer;
import com.example.demo.dto.answer.AnswerRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnswerService {
    public static ArrayList<Answer> answers = new ArrayList<>();

    public ArrayList<Answer> saveAnswer(AnswerRequest answerRequest) {
        answers.add(answerRequest.toEntity());
        return answers;
    }

    public void printAnswers() {
        for (Answer answer : answers) {
            System.out.println("answer.getQuestion() = " + answer.getQuestion());
            System.out.println("answer.getAnswer() = " + answer.getAnswer());
        }
    }
}

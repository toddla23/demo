package com.example.demo.dto.question;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class QuestionResponse {
    private String question;
    private ArrayList<String> answer;


    public QuestionResponse(String question, ArrayList<String> answer) {
        this.question = question;
        this.answer = answer;
    }
}

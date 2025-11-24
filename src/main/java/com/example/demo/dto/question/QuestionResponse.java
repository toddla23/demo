package com.example.demo.dto.question;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class QuestionResponse {
    int step;
    private String question;
    private ArrayList<String> options;


    public QuestionResponse(int step, String question, ArrayList<String> options) {
        this.step = step;
        this.question = question;
        this.options = options;
    }
}

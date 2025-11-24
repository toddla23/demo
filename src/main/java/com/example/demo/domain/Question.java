package com.example.demo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Question {
    private String question;
    private ArrayList<String> options;

    public Question (String question, ArrayList<String> options) {
        this.question = question;
        this.options = options;
    }
}

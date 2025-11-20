package com.example.demo.dto.question;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;


@Getter
@Setter
public class QuestionRequest {
    private String question;
    private ArrayList<String> answer;
}

package com.example.demo.domain;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer {

    @NotEmpty
    private String question;

    @NotEmpty
    private String answer;

    public Answer(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

}

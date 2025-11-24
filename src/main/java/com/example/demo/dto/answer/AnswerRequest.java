package com.example.demo.dto.answer;

import com.example.demo.domain.Answer;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;


/*
{
answer:string
}
 */

@Getter
@Setter
public class AnswerRequest {

    @NotEmpty
    private String question;

    @NotEmpty
    private String answer;

    public Answer toEntity() {
        return new Answer(question, answer);
    }

}

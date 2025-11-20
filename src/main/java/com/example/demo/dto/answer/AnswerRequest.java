package com.example.demo.dto.answer;

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


}

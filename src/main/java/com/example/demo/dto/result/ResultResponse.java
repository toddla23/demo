package com.example.demo.dto.result;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultResponse {
    private String result; // 결과 String
    private String department; // 진료과목명

    public ResultResponse(String result, String department) {
        this.result = result;
        this.department = department;
    }
}

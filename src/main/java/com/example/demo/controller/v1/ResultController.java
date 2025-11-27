package com.example.demo.controller.v1;


import com.example.demo.dto.result.ResultResponse;
import com.example.demo.service.AnswerService;
import com.example.demo.service.ResultService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Result", description = "결과 관련 엔드포인트")
@RestController
@RequestMapping("v1/result")
public class ResultController {
    @Autowired
    ResultService resultService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<ResultResponse> getResult() {
//        ResultResponse resultResponse = new ResultResponse("result", "department");
        ResultResponse result = resultService.getResult();
        AnswerService.answers.clear();

        return ResponseEntity.ok(result);
    }
}

package com.example.demo.controller.v1;

import com.example.demo.dto.user.UserRequest;
import com.example.demo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "유저 정보", description = "유저 사전정보 관련 관련 엔드포인트")
@RestController
@RequestMapping("/v1/users")
public class UserController {
    @Autowired
    UserService userService;

    @Operation(summary = "유저 등록", description = "새로운 유저를 생성합니다.")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity<String> addUser(@Valid @RequestBody UserRequest userRequest) {
        userService.createUser(userRequest);
        return ResponseEntity.ok("OK");
    }
}

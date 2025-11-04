package com.example.demo.dto.user;

import com.example.demo.domain.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/*
{ name: string,

age: number,

gender: number,

location: string,

advancedInformation:string

}
*/
@Getter
@Setter
public class UserRequest {
    @Schema(description = "이름", example = "홍길동", requiredMode = Schema.RequiredMode.REQUIRED)
    @NotEmpty
    private String name;

    @Schema(description = "나이", example = "25")
    @NotNull
    @Min(value = 0)
    private int age;
    
    @Schema(description = "성별 (0:남자, 1:여자", example = "0")
    @NotNull
    private int gender;
    @Schema(description = "현재 위치", example = "서울시 성북구")
    @NotNull
    private String location;
    @Schema(description = "기저질환", example = "천식, 비염")
    @NotNull
    private String advancedInformation;

    public User toEntity() {
        return new User(this.name, this.age, this.gender, this.location, this.advancedInformation);
    }

}

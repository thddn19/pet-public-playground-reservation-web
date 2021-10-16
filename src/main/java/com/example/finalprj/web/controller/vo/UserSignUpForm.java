package com.example.finalprj.web.controller.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSignUpForm {

    private String pgName;
    private String dogNum;
    private String name;
    private String email;
    private String password;
    private String rePassword;

}

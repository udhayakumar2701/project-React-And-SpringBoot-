package com.example.react.Dto;

import lombok.Data;

@Data
public class registerDto {

    private String name;
    private String email;
    private String password;
    private String confirmPassword;
}

package com.example.crud;

import lombok.Data;

@Data
public class StudentDTO {
    private String userName;
    private String displayNameEn;
    private String email;
    private String faculty;
    private String type;
}
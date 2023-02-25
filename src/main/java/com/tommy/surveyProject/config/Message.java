package com.tommy.surveyProject.config;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Message {

    private int statusCode;
    private String message;
    private String data;

}

package com.example.demo.model;


import lombok.Data;

//задача
@Data
public class Task {

    //ид
    private Long id;

    //заголовок
    private String header;

    //описание задачи
    private String description;

    //ответ
    private String answer;

    //
    //private Option option = new Option();
}

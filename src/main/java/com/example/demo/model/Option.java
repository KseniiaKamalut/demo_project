package com.example.demo.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//вариант
@Data
public class Option {

    //ид
    private Long id;

    // признак завершения задачи
    private Boolean isComplete;

    // признак верного решения
    private Boolean isTrue;

    // private List<Task> taskForOption= new ArrayList<>();

    // private List <Student> students= new ArrayList<>();

}

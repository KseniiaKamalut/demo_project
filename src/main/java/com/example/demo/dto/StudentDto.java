package com.example.demo.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
public class StudentDto {

    // ид
    private Long id;

    // имя
    private String name;

    // фамилия
    private String lastName;

    // группа
    private String groups;

    //  private List<Option> optionForStudent= new ArrayList<>();

}

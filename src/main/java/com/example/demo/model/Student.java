package com.example.demo.model;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//студент
@Data
@Entity
public class Student {

    // ид
    @Id
    @SequenceGenerator(name="seq_student")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_student")
    private Long id;

    // имя
    private String name;

    // фамилия
    private String lastName;

    // группа
    private String groups;

  //  private List<Option> optionForStudent= new ArrayList<>();



}

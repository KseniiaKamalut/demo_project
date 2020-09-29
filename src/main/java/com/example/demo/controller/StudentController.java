package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/index")
public class StudentController {

    private StudentService studentService;

    @GetMapping("/all")
    public String findAll(Model model, Sort sort){
        List<StudentDto> studentDtoList= studentService.findAll(sort);
        model.addAttribute("students", studentDtoList);
        return "index";
    }



}

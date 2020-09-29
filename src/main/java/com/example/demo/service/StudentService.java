package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface StudentService {
    List<StudentDto> findAll(Sort sort);
    StudentDto findById(long id);
    long create(StudentDto studentDto);
    void save(StudentDto studentDto);
    void deleteStudentById(long id);
}

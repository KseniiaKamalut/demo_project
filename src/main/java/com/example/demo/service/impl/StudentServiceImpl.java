package com.example.demo.service.impl;

import com.example.demo.dto.StudentDto;
import com.example.demo.mapper.StudentMapper;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {


    private final StudentMapper studentMapper;
    private final StudentRepository studentRepository;


    @Override
    public List<StudentDto> findAll(Sort sort) {
        return null;
    }

    @Override
    public StudentDto findById(long id) {
        return null;
    }

    @Override
    public long create(StudentDto studentDto) {
        return 0;
    }

    @Override
    public void save(StudentDto studentDto) {

    }

    @Override
    public void deleteStudentById(long id) {

    }
}

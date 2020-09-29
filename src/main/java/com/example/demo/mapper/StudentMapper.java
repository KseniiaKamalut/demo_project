package com.example.demo.mapper;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class StudentMapper {

    public StudentDto map(Student student){
        StudentDto studentDto=new StudentDto();
        if (student!=null){
            studentDto.setId(student.getId());
            studentDto.setLastName(student.getLastName());
            studentDto.setName(student.getName());
            studentDto.setGroups(student.getGroups());
        }
        return studentDto;
    }
    public Student map(StudentDto studentDto){
        Student student=new Student();
        if (studentDto!=null){
            student.setId(studentDto.getId());
            student.setLastName(studentDto.getLastName());
            student.setName(studentDto.getName());
            student.setGroups(studentDto.getGroups());
        }
        return student;
    }
}

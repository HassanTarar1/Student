package com.example.studentinfo.Service;

import com.example.studentinfo.Model.Student;
import com.example.studentinfo.Repository.studentRepository;
import com.example.studentinfo.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class studentService {

    @Autowired
    studentRepository studentRepository;

    public Student creatstudents(Student s){
        try{
            studentRepository.save(s);
        }
        catch(Exception e){
            throw e;
        }
        return s;
    }


    public Student getStudentbyId(Long id) throws StudentNotFoundException {

            Student s= studentRepository.findById(id).orElse(new Student());
            if(s!=null){
                return s;
            }

        else {
            throw new StudentNotFoundException("Student not found" + id);
        }

    }
}

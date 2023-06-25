package com.example.studentinfo.Controller;

import com.example.studentinfo.Model.Student;
import com.example.studentinfo.Repository.studentRepository;
import com.example.studentinfo.Service.studentService;
import com.example.studentinfo.exception.StudentNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class studentController {

    @Autowired
    studentRepository studentRepository;

    @Autowired
    studentService studentService;


    @PostMapping("/students")
    public ResponseEntity<Student> createStudent(@RequestBody @Valid Student student) {
        return
                new ResponseEntity<>(studentService.creatstudents(student), HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public List<Student> GetAllStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) throws  StudentNotFoundException {
        return ResponseEntity.ok(studentService.getStudentbyId(id));
    }

    @DeleteMapping("/delete")
    public String DeleteStudent(){
         studentRepository.deleteAll();
         return "Deleted Successfully";
    }




}

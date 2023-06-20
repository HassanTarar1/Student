package com.example.studentinfo.Controller;

import com.example.studentinfo.Model.Student;
import com.example.studentinfo.Repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@RestController
@Profile("prod")
@RequestMapping("/")
public class studentController {

    @Autowired
    studentRepository studentRepository;
    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @GetMapping("/students")
    public List<Student> GetAllStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository
                .findById(id)
                .orElse(null);
    }

    @DeleteMapping("/delete")
    public String DeleteStudent(Student student){
         studentRepository.deleteAll();
         return "Deleted Successfully";
    }




}

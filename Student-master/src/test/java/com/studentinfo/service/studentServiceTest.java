package com.studentinfo.service;

import com.studentinfo.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class studentServiceTest {

    @Autowired
    private StudentService sr;
    @Test
    void creatstudents() {
        Student s=new Student();
        s.setFirstName("hassan");
        s.setLastName("ijaz");
        s.setGpa(3);
        sr.studentRepository.save(s);
    }

    @Test
    void getStudentbyId() {
    }
}
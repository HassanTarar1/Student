package com.example.studentinfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class StudentInfoApplication {

    public static void main(String[] args) {

        SpringApplication.run(StudentInfoApplication.class, args);

    }

}

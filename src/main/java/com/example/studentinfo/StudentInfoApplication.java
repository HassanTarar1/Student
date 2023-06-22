package com.example.studentinfo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Students API", version = "2.0", description = "Studnet Information"))

public class StudentInfoApplication {

    public static void main(String[] args) {

        SpringApplication.run(StudentInfoApplication.class, args);




    }










}

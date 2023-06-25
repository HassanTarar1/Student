package com.example.studentinfo.DTO;

import jakarta.persistence.*;


public class coursesDto {

    private String subjects;

    @Column(name = "student_id")
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Long student_id;

    public coursesDto(String subjects, Long student_id) {
        this.subjects = subjects;
        this.student_id = student_id;
    }



    public coursesDto() {}


    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }


    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Courses{" +
                ", subjects='" + subjects + '\'' +
                '}';
    }
}

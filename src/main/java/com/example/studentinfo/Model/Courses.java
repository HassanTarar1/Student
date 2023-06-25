package com.example.studentinfo.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Table(name = "Courses")
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Subjects are required")
    private String subjects;

    @Column(name = "student_id")
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Long student_id;

    public Courses(Long id, String subjects, Long student_id) {
        this.id = id;
        this.subjects = subjects;
        this.student_id = student_id;
    }



    public Courses() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
                "id=" + id +
                ", subjects='" + subjects + '\'' +
                '}';
    }
}

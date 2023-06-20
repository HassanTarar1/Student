package com.example.studentinfo.Model;


import jakarta.persistence.*;

import java.util.List;

@Table(name = "Student")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName; // camel case
    private String lastName;
    private double gpa;


    @OneToMany(targetEntity = Courses.class, cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "id")
    private List<Courses> courses;

    public Student(long id, String firstName, String lastname, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        this.gpa = gpa;
    }
    public Student() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

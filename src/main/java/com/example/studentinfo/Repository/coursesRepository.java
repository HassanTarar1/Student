package com.example.studentinfo.Repository;

import com.example.studentinfo.Model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface coursesRepository extends JpaRepository<Courses, Long> {
}

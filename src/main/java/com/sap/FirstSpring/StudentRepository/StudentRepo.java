package com.sap.FirstSpring.StudentRepository;


import com.sap.FirstSpring.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, String> {
    @Query(value = "Select * from Student where batch = ?1", nativeQuery = true)
    List<Student> getStudentByBatch(String batch);
    @Query(value = "Select * from Student where name = ?1 and percentage between ?2 and ?3", nativeQuery = true)
    List<Student> getStudentsByPercentageRange(String name, int p1, int p2);
}

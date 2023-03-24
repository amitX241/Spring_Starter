package com.sap.FirstSpring.StudentService;

import com.sap.FirstSpring.Entity.Student;
import com.sap.FirstSpring.StudentRepository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentLogic {

    @Autowired
    StudentRepo studentRepo;

    public List<Student> getAll() {
        return this.studentRepo.findAll();
    }

    public void saveStudent(Student student) {
        System.out.println(student.toString());
        this.studentRepo.save(student);
    }

    public List<Student> getStudentByBatch(String batch) {
        return this.studentRepo.getStudentByBatch(batch);
    }

    public List<Student> getStudentsByPercentageRange(String name, int p1, int p2) {
        return this.studentRepo.getStudentsByPercentageRange(name,p1,p2);
    }
}

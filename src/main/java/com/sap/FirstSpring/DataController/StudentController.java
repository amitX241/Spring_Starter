package com.sap.FirstSpring.DataController;

import com.sap.FirstSpring.Entity.Student;
import com.sap.FirstSpring.StudentService.StudentLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    @Autowired
    StudentLogic studentLogic;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.studentLogic.getAll();
//        System.out.println(this.studentLogic.getAll());
    }

    @PostMapping("/insert")
    public void saveStudent(@RequestBody Student student) {
        this.studentLogic.saveStudent(student);
    }

    @GetMapping("/student")
    public List<Student> getStudentByBatch(@RequestParam("batch") String batch) {
        return this.studentLogic.getStudentByBatch(batch);
    }

    @PostMapping("/InsertStudent")
    public ResponseEntity<String> saveStudentData(@RequestBody @Validated Student student) {
        this.studentLogic.saveStudent(student);
        return new ResponseEntity<>("accepted", HttpStatus.OK);
//        try {
//            this.studentLogic.saveStudent(student);
//            return new ResponseEntity<>("accepted", HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
//        }
    }

    @GetMapping("/studentrange/{name}")
    public List<Student> getStudentsByPercentageRange(@PathVariable String name ,@RequestParam("p1") int p1, @RequestParam("p2") int p2) {
        return this.studentLogic.getStudentsByPercentageRange(name,p1,p2);
    }
}

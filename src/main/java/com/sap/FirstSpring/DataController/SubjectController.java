package com.sap.FirstSpring.DataController;

import com.sap.FirstSpring.Entity.Student;
import com.sap.FirstSpring.Entity.Subject;
import com.sap.FirstSpring.StudentRepository.SubjectRepo;
import com.sap.FirstSpring.exceptions.CustomNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjectURL")
public class SubjectController {

    @Autowired
    SubjectRepo subjectRepo;

    @GetMapping("/getSubjects")
    public ResponseEntity<List<Subject>> getSubjectList() {
        return new ResponseEntity<>(this.subjectRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping("/saveSubject")
    public ResponseEntity<String> saveSubject(@RequestBody Subject subject) {
        try {
            this.subjectRepo.save(subject);
            return new ResponseEntity<>("Data Saved", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/exceptions")
    public void exceptions() throws CustomNotFoundException {
        throw new CustomNotFoundException();
    }

}

package com.sap.FirstSpring.StudentRepository;

import com.sap.FirstSpring.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, String> {
}

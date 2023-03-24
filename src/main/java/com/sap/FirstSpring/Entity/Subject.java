package com.sap.FirstSpring.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

    @Id
    public String subjectName;

    public String teacher;

    public String credits;


    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }


}

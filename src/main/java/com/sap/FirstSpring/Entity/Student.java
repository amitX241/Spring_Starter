package com.sap.FirstSpring.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @NotNull
    public String email;

    @NotNull
    public String iNumber;

    public String name;

    public String batch;

    public int percentage;

    @JoinColumn(
            name = "fk",
            referencedColumnName = "subjectName"
    )
    @OneToOne(cascade = CascadeType.ALL)
    Subject subject;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", iNumber='" + iNumber + '\'' +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", percentage=" + percentage +
                ", subject=" + subject +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getiNumber() {
        return iNumber;
    }

    public void setiNumber(String iNumber) {
        this.iNumber = iNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}

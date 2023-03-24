package com.sap.FirstSpring.service;


import com.sap.FirstSpring.StudentRepository.StudentRepo;
import com.sap.FirstSpring.StudentService.StudentLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;

@SpringBootTest
public class StudentLogicTest {

    @Autowired
    StudentLogic studentLogic;

    @MockBean
    StudentRepo studentRepo;

    @Test
    public void getAllTest() {
        Mockito.when(studentRepo.findAll()).thenReturn(new ArrayList<>());
//        Mockito.doNothing().when(studentRepo._____); Do nothing when this function is encountered
        Assertions.assertArrayEquals(studentLogic.getAll().toArray(), new ArrayList<>().toArray());
        Mockito.verify(studentRepo, Mockito.times(1)).findAll();
    }
}

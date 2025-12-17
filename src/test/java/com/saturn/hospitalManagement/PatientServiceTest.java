package com.saturn.hospitalManagement;

import com.saturn.hospitalManagement.entity.Patient;
import com.saturn.hospitalManagement.repository.PatientRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    PatientRepo patientRepo;

    @Test
    public void testPatient(){
        List<Patient> patients = patientRepo.findAll();
        System.out.println(patients);

    }
}

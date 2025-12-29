package com.saturn.hospitalManagement.service;

import com.saturn.hospitalManagement.entity.Patient;
import com.saturn.hospitalManagement.repository.PatientRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    @Transactional
    public void testPatientTransaction(){
        Patient p1 = patientRepo.findById(1L).orElseThrow();
        Patient p2 = patientRepo.findById(1L).orElseThrow();
        System.out.println(p1+ "  "+p2);
        System.out.println(p1==p2);
    }
}

package com.saturn.hospitalManagement.service;

import com.saturn.hospitalManagement.entity.Insurance;
import com.saturn.hospitalManagement.entity.Patient;
import com.saturn.hospitalManagement.repository.InsuranceRepo;
import com.saturn.hospitalManagement.repository.PatientRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {


    private final InsuranceRepo insuranceRepo;
    private final PatientRepo patientRepo;

    @Transactional
    public Insurance assignInsurance(Insurance insurance, Long pId){
        Patient patient = patientRepo.findById(pId).orElseThrow();
        patient.setInsurance(insurance);
        //insurance.setPatient(patient);
        return insurance;
    }




}
